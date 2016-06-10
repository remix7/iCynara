package com.icynara.service;

import com.icynara.base.DaoSupport;
import com.icynara.domain.Blog;

public interface BlogService extends DaoSupport<Blog> {
	void svae(Blog blog);
}
