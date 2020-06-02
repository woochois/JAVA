package com.kr.inheritance;

public class Marine extends Unit{ // 자식클래스
	String weapon; // 총 , 칼
	int water; // 0 ~ 9
	
	public Marine() {
		x = 1;
		y = 1;
		life = true;
		water = (int)(Math.random() * 10); 
		initPos(); // 메소드 상속도 가능하다.
	}
	
}
