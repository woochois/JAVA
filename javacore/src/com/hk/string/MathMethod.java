package com.hk.string;

public class MathMethod {
	public static void main(String[] args) {
		double input = 35.121414;
		System.out.println(Math.round(input)); // 소수  첫 번째 자리에서 반올림
		// 3512.1313 -> 3512 -> 35.12
		// 소수 몇 번째에서 반올림
		System.out.println(Math.round(input*100)/100.0);
				
	}
}
