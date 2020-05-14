package com.hk.app1;

public class Cast2 {
	public static void main(String[] args) {
		char c = 'F';
		System.out.println(c);
		int result = c; // 2byte -> 4byte
		System.out.println(result);
		
		// 71?
		int i = 71;
		char c2 = (char)i;
		System.out.println(c2);
		// A B C D E F G
		// 65 66 67 68 69 70 71
		
	}
}
