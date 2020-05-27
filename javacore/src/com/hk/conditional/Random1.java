package com.hk.conditional;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		
		// 임의의 숫자를 발생시켜보자

		Random zen = new Random();
		int anynum = 0;
		anynum = zen.nextInt(); // 정수 중에서 아무 수.
		System.out.println("임의의 숫자는 : " + anynum);

		// 0~9까지 임의의 숫자를 만들어보자
		int num1 = 0;
		num1 = zen.nextInt(10); // 입력값 n = 0 ~ n-1
		System.out.println("0~9까지의 임의의 숫자는 : " + num1);
		
		// 1~10까지
		int num10 = 0;
		num10 = zen.nextInt(10) + 1; // 입력값 n = 1~10
		System.out.println("1~10까지의 임의의 숫자는 : " + num10);
		
		// 주사위의 눈의 경우 1~6
		int numDice = 0;
		numDice = zen.nextInt(6) + 1;
		System.out.println("주사위의 눈 : " + numDice);
		
		
	}

}
