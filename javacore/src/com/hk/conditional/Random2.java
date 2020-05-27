package com.hk.conditional;

public class Random2 {

	public static void main(String[] args) {
		// Math.random() = ? 반환값 double
		double num = Math.random();
		System.out.println("임의의 실수 숫자 : " + num); // 0.0000 ~ 0.9999
		
		// 0~9까지
		double num2 = num * 10;
		System.out.println("임의의 실수 숫자2 : " + num2); // 0.0000 ~ 9.9999
		
		int no2 = (int)num2;
		System.out.println("임의의 정수 숫자 : " + no2); // 0 ~ 9
		
		int no3 = no2 + 1;
		System.out.println("임의의 정수 숫자2 : " + no3); // 1 ~ 10
		
		// 주사위 1~6 이렇게 만들면
		double num20 = Math.random();
		int result = (int)(num20 * 6) + 1;
		System.out.println("주사위의 눈의 수 : " + result);
		
		
	}

}
