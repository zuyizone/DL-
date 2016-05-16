package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Shop entity. @author MyEclipse Persistence Tools
 */

public class Shop implements java.io.Serializable {

	// Fields

	private Integer shopId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String description;
	private Integer userId;
	private String name;

	// Constructors

	/** default constructor */
	public Shop() {
	}

	/** minimal constructor */
	public Shop(String description, Integer userId, String name) {
		this.description = description;
		this.userId = userId;
		this.name = name;
	}

	/** full constructor */
	public Shop(Timestamp createTime, Timestamp updateTime, String description,
			Integer userId, String name) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.description = description;
		this.userId = userId;
		this.name = name;
	}

	// Property accessors

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}