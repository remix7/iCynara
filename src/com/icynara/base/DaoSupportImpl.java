package com.icynara.base;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.icynara.cfg.Configuration;
import com.icynara.domain.PageBean;

@SuppressWarnings("unchecked")
@Transactional
public abstract class DaoSupportImpl<T> implements DaoSupport<T> {
	@Resource
	private SessionFactory sessionFactory;

	protected Class<T> clazz = null;

	// public BaseDaoImpl(Class<T> clazz) {
	// this.clazz = clazz;
	// }

	// 通过默认构造方法
	public DaoSupportImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		this.clazz = (Class<T>) type.getActualTypeArguments()[0];
	}

	// 获取当前可以用的session

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		getSession().save(entity);
	}

	public void update(T entity) {
		getSession().update(entity);
	}

	public void delete(String id) {
		if (id == null) {
			return;
		}
		Object entity = getById(id);
		if (entity != null) {
			getSession().delete(entity);
		}
	}

	public List<T> findAll() {
		return getSession().createQuery("from " + clazz.getSimpleName()).list();
	}

	public T getById(String id) {
		if (id == null) {
			return null;
		} else {
			return (T) getSession().get(clazz, id);
		}
	}

	public List<T> getByIds(String[] ids) {
		if(ids==null ||ids.length==0){
			return Collections.EMPTY_LIST;
		}
		return getSession().createQuery(
				"FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)")//
				.setParameterList("ids", ids) // 一定要使用setParameterList
				.list();
	}

	public PageBean getPageBean(int pageNum, String hql, Object[] args) {
		//获取pagesize信息
		int pageSize = Configuration.getPageSize();
		//查询数据列表
		Query query = getSession().createQuery(hql);
		if(args!=null&&args.length>0){ //设置参数
			for (int i = 0; i < args.length; i++) {
				query.setParameter(i, args[i]);
			}
		}
		query.setFirstResult((pageNum-1)*pageSize);
		query.setMaxResults(pageSize);
		List list = query.list();//查询
		//查询总记录数
		query = getSession().createQuery("SELECT COUNT(*) "+hql.substring(0,hql.indexOf("ORDER"))); //空格
		if(args!=null&&args.length>0){ //设置参数
			for (int i = 0; i < args.length; i++) {
				query.setParameter(i, args[i]); 
			}
		}
		Long count = (Long)query.uniqueResult();
		
		return new PageBean(pageNum, pageSize, count.intValue(), list);
	}
	
}
