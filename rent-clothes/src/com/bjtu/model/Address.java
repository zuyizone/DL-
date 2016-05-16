package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Integer addressId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String phone;
	private String address;
	private String code;
	private String name;
	private Integer userId;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(String phone, String address, String code, String name,
			Integer userId) {
		this.phone = phone;
		this.address = address;
		this.code = code;
		this.name = name;
		this.userId = userId;
	}

	/** full constructor */
	public Address(Timestamp createTime, Timestamp updateTime, String phone,
			String address, String code, String name, Integer userId) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.phone = phone;
		this.address = address;
		this.code = code;
		this.name = name;
		this.userId = userId;
	}

	// Property accessors

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}