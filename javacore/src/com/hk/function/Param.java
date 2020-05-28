package com.hk.function;

public class Param {
	public static void main(String[] args) {
		
		
		// 정수 변수 2개 x, y
		int x = 2;
		int y = 3;
		System.out.println(Multiply(x,y));
		
	}
	// 곱하는 함수 Multiply(int a, int b)
	private static int Multiply(int a, int b) {
		int result = a * b;
		return result;
	}
}
