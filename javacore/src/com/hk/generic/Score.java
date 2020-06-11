package com.hk.generic;

public class Score {
	private String name;
	private int kor;
	private int chn;
	private int jpn;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getKor() {
		return kor;
	}
	protected void setKor(int kor) {
		this.kor = kor;
	}
	protected int getChn() {
		return chn;
	}
	protected void setChn(int chn) {
		this.chn = chn;
	}
	protected int getJpn() {
		return jpn;
	}
	protected void setJpn(int jpn) {
		this.jpn = jpn;
	}
}
