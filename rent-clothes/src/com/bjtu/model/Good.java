package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Good entity. @author MyEclipse Persistence Tools
 */

public class Good implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer label;
	private String description;
	private Integer price;
	private String size;
	private Integer shopId;
	private String path;

	// Constructors

	/** default constructor */
	public Good() {
	}

	/** minimal constructor */
	public Good(Integer label, String description, Integer price, String size,
			Integer shopId, String path) {
		this.label = label;
		this.description = description;
		this.price = price;
		this.size = size;
		this.shopId = shopId;
		this.path = path;
	}

	/** full constructor */
	public Good(Timestamp createTime, Timestamp updateTime, Integer label,
			String description, Integer price, String size, Integer shopId,
			String path) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.label = label;
		this.description = description;
		this.price = price;
		this.size = size;
		this.shopId = shopId;
		this.path = path;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
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

	public Integer getLabel() {
		return this.label;
	}

	public void setLabel(Integer label) {
		this.label = label;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getShopId() {
		return this.shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}