package com.bjtu.service;

import com.bjtu.model.User;

/**
 * 
 * @author zhang
 * ������������ �� dao--->dao.impl--->service---->service.impl---->action
 * service���д�Ÿ���ҵ��Ľӿڣ���service.impl��ʵ�֡� ��actionʹ��
 * �����д���û� �� �̼ҵĵ�¼ע��ӿ�
 */

public interface UserService {

	public User checkStudent(User user);
}
