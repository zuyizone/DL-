package com.bjtu.service.impl;

import com.bjtu.dao.UserDao;
import com.bjtu.model.User;
import com.bjtu.service.UserService;


/**
 * 
 * @author zhang
 * 实现UserService接口， 供action层调用
 * 返回一个user对象
 */
public class IUserService implements UserService {

	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public User checkStudent(User user) {

		return userdao.checkStudent(user);
	}

}
