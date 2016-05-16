package com.bjtu.model;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String number;
	private String passWord;
	private Integer role;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String number, String passWord, Integer role) {
		this.number = number;
		this.passWord = passWord;
		this.role = role;
	}

	/** full constructor */
	public User(Timestamp createTime, Timestamp updateTime, String number,
			String passWord, Integer role) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.number = number;
		this.passWord = passWord;
		this.role = role;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getRole() {
		return this.role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

}