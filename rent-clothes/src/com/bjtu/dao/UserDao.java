package com.bjtu.dao;

import com.bjtu.model.User;

/**
 * 
 * @author zhang
 * ������������ �� dao--->dao.impl--->service---->service.impl---->action
 * dao���д�Ÿ���ҵ��Ľӿڣ���dao.impl��ʵ�֡� ��serviceʹ��
 * �����д���û� �� �̼ҵĵ�¼ע��ӿ�
 */

public interface UserDao {

	public User checkStudent(User user);

}
