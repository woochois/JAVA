package com.hk.string;

import java.util.Scanner;

public class StringInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); // 100, 200
		System.out.println("입력값은 : " + input);
		int num = Integer.valueOf(input); // 숫자로 변경 parseInteger()
		System.out.println("입력값 + 10 : " + (num+10));
		
		System.out.println("입력값 + 10 : " + (input+10));
		
		String str1 = "" + 100; // 문자열 + 다른 타입(문자열 형변환) = 문자열
		String str2 = String.valueOf(100); // 문자열
		
	}
}
