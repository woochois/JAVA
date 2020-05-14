package com.hk.app2;

public class Single2 {

	public static void main(String[] args) {
		// 증감연산자
//		int x = 10;
//		int y = 11;
//		int z = x++ + y++;
//		System.out.println(z);
//		System.out.println(x);
//		System.out.println(y);
		int x = 10;
		int y = 11;
		int z = 12;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		int guess = x++ + --y + z++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(guess);
	}

}
