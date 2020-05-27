package com.hk.var;

public class Vary3 {

	public static void main(String[] args) {
		int max = 2; // 기본 값 0으로 초기화
		int result = max * 100;
		// 꼭 초기 값 대입하고 시작하자
		// 초기 값이 잘못되면 로직이 올바르더라도 결과는 예측할 수 없다.
		System.out.println(result);
	}

}
