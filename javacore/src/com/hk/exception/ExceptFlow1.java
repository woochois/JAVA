package com.hk.exception;

public class ExceptFlow1 {
	public static void main(String[] args) {
		try {
			System.out.println(1+"번째 코드");
			System.out.println(2+"번째 코드");
			System.out.println(3+"번째 코드");
			int a = 10, b = 0, c = a/b; // 계산 오류
			// 위에서 에러가 나면 어디로 가는가?
			System.out.println(4+"번째 코드"); // 흐름이 도달 안함
			System.out.println(5+"번째 코드");
		} catch (ArithmeticException e) {
			System.out.println(6+"번째 코드 : 예외코드출력 " + e);
			System.out.println(7+"번째 코드");
		}
		System.out.println(8+"번째 코드");
	}
}
