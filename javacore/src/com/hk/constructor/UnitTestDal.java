package com.hk.constructor;

public class UnitTestDal {
	public static void main(String[] args) {
		// 달무티 카드 생성
		Dalmuti king = new Dalmuti();
		king.kind = 1;
		Dalmuti minister = new Dalmuti();
		minister.kind = 2;
		Dalmuti minister2 = new Dalmuti();
		minister2.kind = 2;
		Dalmuti[] leader = new Dalmuti[3];
		leader[0] = new Dalmuti();
		leader[0].kind = 3;
		
		Dalmuti Baron = new Dalmuti(4);
	}
}
