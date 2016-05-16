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
 * 由于数据库设计问题，在action文件中假设使用ID 和 password
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
	 * 根据jsp页面获得的数据，传到user1中，利用service层的checkstudent方法进行判断，并将查询到的结果放置到user2 中
	 * 如果未查询到，则返回错误页面
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
