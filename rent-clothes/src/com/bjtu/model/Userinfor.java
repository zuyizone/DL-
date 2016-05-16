package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Userinfor entity. @author MyEclipse Persistence Tools
 */

public class Userinfor implements java.io.Serializable {

	// Fields

	private Integer userInforId;
	private String name;
	private String photo;
	private String phone;
	private String address;
	private Integer userId;
	private Timestamp createTime;
	private Timestamp updateTime;

	// Constructors

	/** default constructor */
	public Userinfor() {
	}

	/** minimal constructor */
	public Userinfor(String name, String photo, String phone, String address,
			Integer userId) {
		this.name = name;
		this.photo = photo;
		this.phone = phone;
		this.address = address;
		this.userId = userId;
	}

	/** full constructor */
	public Userinfor(String name, String photo, String phone, String address,
			Integer userId, Timestamp createTime, Timestamp updateTime) {
		this.name = name;
		this.photo = photo;
		this.phone = phone;
		this.address = address;
		this.userId = userId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getUserInforId() {
		return this.userInforId;
	}

	public void setUserInforId(Integer userInforId) {
		this.userInforId = userInforId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

}