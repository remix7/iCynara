package com.icynara.service;

import com.icynara.base.DaoSupport;
import com.icynara.domain.User;

public interface UserService extends DaoSupport<User>{
	//根据用户名密码登录
	User getByUnAndPw(String userName, String password);
	//	根据email来查询用户是否存在 默认一个email对应一个用户
	User getByEmail(String email);
	//根据用户的返回值来判断是否成功
	User getByNote(String mailCode);
	/**
	 *  根据email查询用户
	 * @param email
	 * @return
	 */

}
