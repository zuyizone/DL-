package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer goodsId;
	private Integer addressId;
	private Integer shopId;
	private Integer status;
	private Integer userId;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer goodsId, Integer addressId, Integer shopId,
			Integer status, Integer userId) {
		this.goodsId = goodsId;
		this.addressId = addressId;
		this.shopId = shopId;
		this.status = status;
		this.userId = userId;
	}

	/** full constructor */
	public Order(Timestamp createTime, Timestamp updateTime, Integer goodsId,
			Integer addressId, Integer shopId, Integer status, Integer userId) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.goodsId = goodsId;
		this.addressId = addressId;
		this.shopId = shopId;
		this.status = status;
		this.userId = userId;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}