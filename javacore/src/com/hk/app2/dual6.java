package com.hk.app2;

public class dual6 {

	public static void main(String[] args) {
		// 논리연산자 && ||
		// 김건우 age = 23; tall = 180;
		// 이지호 age = 19; tall = 170;
		int kage = 23;
		int ktall = 180;
		int lage = 19;
		int ltall = 170;
		
		boolean kresult = kage > 30 && ktall < 190;
		boolean lresult = lage < 30 && ltall < 180;
		
		System.out.println(kresult);
		System.out.println(lresult);
	}

}
