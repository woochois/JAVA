package com.hk.dao;

public class WorkerVo {
	private String id;
	private String pwd;
	private String name;
	private String phone;
	
	
	// 인스턴스변수가 private 이므로 getter 구현
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}