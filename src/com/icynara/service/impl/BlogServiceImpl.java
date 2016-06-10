package com.icynara.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icynara.base.DaoSupportImpl;
import com.icynara.domain.Blog;
import com.icynara.service.BlogService;
@Service
@Transactional
public class BlogServiceImpl extends DaoSupportImpl<Blog> implements BlogService{

	public void svae(Blog blog) {
		String count = getSession().createQuery(//
				"SELECT COUNT(*) FROM Blog b").toString();
		blog.setReplyCount(Integer.parseInt(count));
		save(blog);
	}
}
