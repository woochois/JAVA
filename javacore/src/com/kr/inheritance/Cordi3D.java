package com.kr.inheritance;

public class Cordi3D extends Cordi{
	int z;
	void where_are_you() {
		getCordi(); // 1번 - z 출력
		super.getCordi(); // 2번 출력
	}
	
	// 오버라이딩 overriding
	@Override
	String getCordi() { // 1번
		return "("+r+","+c+","+z+")";
	}
	
}
