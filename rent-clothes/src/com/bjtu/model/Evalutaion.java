package com.bjtu.model;

import java.sql.Timestamp;

/**
 * Evalutaion entity. @author MyEclipse Persistence Tools
 */

public class Evalutaion implements java.io.Serializable {

	// Fields

	private Integer evaluationId;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer userId;
	private Integer goodsId;
	private String content;

	// Constructors

	/** default constructor */
	public Evalutaion() {
	}

	/** minimal constructor */
	public Evalutaion(Integer userId, Integer goodsId, String content) {
		this.userId = userId;
		this.goodsId = goodsId;
		this.content = content;
	}

	/** full constructor */
	public Evalutaion(Timestamp createTime, Timestamp updateTime,
			Integer userId, Integer goodsId, String content) {
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.userId = userId;
		this.goodsId = goodsId;
		this.content = content;
	}

	// Property accessors

	public Integer getEvaluationId() {
		return this.evaluationId;
	}

	public void setEvaluationId(Integer evaluationId) {
		this.evaluationId = evaluationId;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}