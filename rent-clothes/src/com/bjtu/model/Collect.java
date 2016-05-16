package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Collect entity. @author MyEclipse Persistence Tools
 */

public class Collect implements java.io.Serializable {

	// Fields

	private Integer collectionId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer userId;
	private Integer goodsId;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** minimal constructor */
	public Collect(Integer userId, Integer goodsId) {
		this.userId = userId;
		this.goodsId = goodsId;
	}

	/** full constructor */
	public Collect(Timestamp createTime, Timestamp updateTime, Integer userId,
			Integer goodsId) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.userId = userId;
		this.goodsId = goodsId;
	}

	// Property accessors

	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
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

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

}