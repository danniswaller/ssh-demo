package com.github.danniswaller.sshdemo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;// 唯一标识
	private String username;// 用户名
	private String password;// 密码
	private String email;// 注册邮箱 唯一
	private Integer type;// 客户类型 1为普通客户 2为管理员 3超级管理员

	@Column(name = "status", nullable = false, columnDefinition = "char(1) default 'N'")
	@Type(type = "yes_no")

	private boolean status = true;// 是否禁用
	private String loginIp; // 登录IP
	private Date loginTime;// 登录时间
	private String lastLoginIp;// 上次登录IP

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	private Date lastLoginTime;// 上次登录时间

}
