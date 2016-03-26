package com.github.danniswaller.sshdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDir {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
  private Long id ;//唯一标识
  private String name;//分类的中文名称
  private String englishName;//英文名称
  private String intro;//分类简介
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
public String getEnglishName() {
	return englishName;
}
public void setEnglishName(String englishName) {
	this.englishName = englishName;
}
public String getIntro() {
	return intro;
}
public void setIntro(String intro) {
	this.intro = intro;
}
  
}
