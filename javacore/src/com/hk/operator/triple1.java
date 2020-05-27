package com.hk.operator;

public class triple1 {

	public static void main(String[] args) {
		// 삼항연산자 (비교식) ? 실행1 : 실행2
		int x = -10;
		int result = (x<0) ? -x : x; // 절대값
		System.out.println(result);
	}
}
