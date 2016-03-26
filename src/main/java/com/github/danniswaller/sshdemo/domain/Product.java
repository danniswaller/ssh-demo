package com.github.danniswaller.sshdemo.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Product {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
 private Long id;  //唯一标识
 private String name;//中文名字
 private String sn;//商品编号
 private Integer num;//库存
 private BigDecimal costPrice;//成本价格
 private BigDecimal marketPrice;//市场价格
 private BigDecimal salePrice;//自己零售价格
 private String place; //生产地
 private String model;//规格:长,宽,高
 private String intro;//商品简介
 private String bigPic;//商品大图
 private String smallPic;//商品小图
 private Date inputDate;//上架时间
 private Integer viewTimes;//浏览的次数
 @Column(name = "recommended", nullable = false, columnDefinition = "char(1) default 'N'")
	@Type(type = "yes_no")
 private boolean recommended=false;//是否推荐
 private Integer status;//上架1,下架0
 private Long dir_id;//商品分类
 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSn() {
	return sn;
}
public void setSn(String sn) {
	this.sn = sn;
}
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
}
public BigDecimal getCostPrice() {
	return costPrice;
}
public void setCostPrice(BigDecimal costPrice) {
	this.costPrice = costPrice;
}
public BigDecimal getMarketPrice() {
	return marketPrice;
}
public void setMarketPrice(BigDecimal marketPrice) {
	this.marketPrice = marketPrice;
}
public BigDecimal getSalePrice() {
	return salePrice;
}
public void setSalePrice(BigDecimal salePrice) {
	this.salePrice = salePrice;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getIntro() {
	return intro;
}
public void setIntro(String intro) {
	this.intro = intro;
}
public String getBigPic() {
	return bigPic;
}
public void setBigPic(String bigPic) {
	this.bigPic = bigPic;
}
public String getSmallPic() {
	return smallPic;
}
public void setSmallPic(String smallPic) {
	this.smallPic = smallPic;
}
public Date getInputDate() {
	return inputDate;
}
public void setInputDate(Date inputDate) {
	this.inputDate = inputDate;
}
public Integer getViewTimes() {
	return viewTimes;
}
public void setViewTimes(Integer viewTimes) {
	this.viewTimes = viewTimes;
}
public boolean isRecommended() {
	return recommended;
}
public void setRecommended(boolean recommended) {
	this.recommended = recommended;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}
public Long getDir_id() {
	return dir_id;
}
public void setDir_id(Long dir_id) {
	this.dir_id = dir_id;
}

 
}
