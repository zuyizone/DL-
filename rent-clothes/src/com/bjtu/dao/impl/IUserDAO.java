package com.bjtu.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bjtu.dao.UserDao;
import com.bjtu.model.User;

/**
 * 
 * @author zhang
 *实现UserDao层的接口，实现登录功能
 *返回一个User对象
 */

public class IUserDAO implements UserDao{

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public User checkStudent(User user) {

		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		/**
		 * 使用SQL查询，查询到表中数据，但是没法放回对象结果集
		 */
	    Query query=session.createSQLQuery("select * from user where Number='"+user.getNumber()+"' and PassWord='"+user.getPassWord()+"'");

	    try {
			List list = query.list();
			ts.commit();
			session.close();
			if (list.size() != 0) {
				System.out.println("查询到数据了");
				return user;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

}
