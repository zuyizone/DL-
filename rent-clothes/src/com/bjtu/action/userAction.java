package com.bjtu.action;

import java.util.Map;

import com.bjtu.model.User;
import com.bjtu.service.UserService;
import com.bjtu.service.impl.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author zhang
 * �������ݿ�������⣬��action�ļ��м���ʹ��ID �� password
 *
 */
public class userAction extends ActionSupport {
	
	private String userNumber ;
	private String password;
	private User user;
	private UserService userservice;
	
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 * ����jspҳ���õ����ݣ�����user1�У�����service���checkstudent���������жϣ�������ѯ���Ľ�����õ�user2 ��
	 * ���δ��ѯ�����򷵻ش���ҳ��
	 */
	public String checkUser()throws Exception{
		System.out.println(userNumber);
		System.out.println(password);

		Map session=(Map) ActionContext.getContext().getSession();
		User user1=new User();
		
		user1.setNumber(userNumber);
		user1.setPassWord(password);
	
		User user2=userservice.checkStudent(user1);
	
		if(user2!=null)	
		{session.put("user",user2);
		return SUCCESS;	}
		else
		{
			return ERROR;
		}
	}
	
}
