package com.hk.app2;

public class dual2 {

	public static void main(String[] args) {
		int x = 1000000; // long
		int y = 1000000;
		int z1 = x * y;
		long z  = (long)x * y;
		System.out.println(z);
		System.out.println(z1);
		// 자바는 수학계산에 적합하지 않다.
		
	}

}
