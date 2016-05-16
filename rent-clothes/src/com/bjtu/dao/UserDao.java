package com.bjtu.dao;

import com.bjtu.model.User;

/**
 * 
 * @author zhang
 * 基本调用流程 ： dao--->dao.impl--->service---->service.impl---->action
 * dao包中存放各种业务的接口，在dao.impl中实现。 供service使用
 * 该类中存放用户 和 商家的登录注册接口
 */

public interface UserDao {

	public User checkStudent(User user);

}
