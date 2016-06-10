package com.icynara.base;

import java.util.List;

public interface DaoSupport<T> {
	/**
	 * 保存
	 * @param entity
	 */
	void save(T entity);
	/**
	 * 根据id删除
	 * @param id
	 */
	void delete(String id);
	/**
	 * 更新
	 * @param entity
	 */
	void update(T entity);
	/**
	 * 根据id查一个
	 * @param id
	 * @return
	 */
	T getById(String id);
	/**
	 * 根据id数组查多个
	 * @param id
	 * @return
	 */
	List<T> getByIds(String[] ids);
	/**
	 * 查询所有
	 * @return
	 */
	List<T> findAll();
	/**
	 * 公共查询分页信息的方法   在方法内部 会自动
	 * @param pageNum 当前页码
	 * @param hql hql语句
	 * @param args 参数
	 * @return
	 */
//	PageBean getPageBean(int pageNum,String hql,Object[] args);
	
}
