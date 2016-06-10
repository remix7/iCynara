package com.icynara.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.icynara.base.DaoSupportImpl;
import com.icynara.domain.User;
import com.icynara.service.UserService;
import com.icynara.util.MD5EncodingUtils;
@Service
@Transactional
public class UserServiceImpl extends DaoSupportImpl<User> implements UserService {

	public User getByUnAndPw(String userName, String password) {
		
		return (User)getSession().createQuery(//
				"FROM User u WHERE u.userName = ? AND u.password = ?")
				.setParameter(0, userName)
				.setParameter(1, MD5EncodingUtils.getMD5(password))
				.uniqueResult();
	}

	public User getByEmail(String email) {
		return (User)getSession().createQuery(//
		"FROM User u WHERE u.email = ? ")//
		.setParameter(0, email)//
		.uniqueResult();
	}

	public User getByNote(String mailCode) {
		return (User)getSession().createQuery(//
		"FROM User u WHERE u.note = ? ")//
		.setParameter(0, mailCode)//
		.uniqueResult();
	}

}
