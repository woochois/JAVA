package com.hk.operator;

public class Single4 {
	public static void main(String[] args) {
		// 비트 전환 연산자
		byte test = 10; // 2진수로 바꾸면 00001010 // 1byte = 8bit
		// 11110101
		int result = ~test;
		System.out.println(result);
		// 정수의 연산이 이루어지는 경우에는 int(4byte)형으로 계산
	}
}
