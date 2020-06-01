package com.hk.function;

import java.util.Random;

public class RandomTest {

	// 예제
	// 0 ~ 9 까지 랜덤한 숫자를 발생시키는 함수
	public static int RandomNum() {
		Random ran = new Random(); 
		return ran.nextInt(10);
	}
	
	public static void main(String[] args) {
		
		int result = RandomNum();
		System.out.println("결과 출력 : " + result);
		printResult(result);
	}
	
	// 리턴 타입이 없는 경우에는 void
	public static void printResult(int result) {
		System.out.println("결과 출력 : " + result);
	}
}
