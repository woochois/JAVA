package com.kr.inheritance;

public class Animal extends Unit{ // 자식 클래스
	int leg; // 다리
	String sound; // 멍멍 , 아우
	int wing; // 날개
	
	public Animal() {
		x = 2;
		y = 1;
		life = true;
		leg = 4;
		wing = 0;
		initPos(); // 메소드 상속도 가능하다.
	}
	
	void setSound(String s) {
		sound = s;
	}
}
