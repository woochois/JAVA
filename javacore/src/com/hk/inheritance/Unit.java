package com.hk.inheritance;

public class Unit { // 부모 클래스  extends Object 가 생략되어있다.
	int x, y; // 좌표 변수 (정수) 
	boolean life; // 생명 변수
	
	void initPos() {
		x = 0;
		y = 0;
	}
}
