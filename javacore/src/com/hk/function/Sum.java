package com.hk.function;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		
// 반복문 이용
		// 1 ~ 100 까지 합을 구하시오
		int result = 0;
		for(int i = 0; i < 100; i++) {
			result += i;
		}
		System.out.println(result);
		// 1 ~ n 까지 합을 구하시오
		int n = 200;
		int result2 = 0;
		for(int i = 0; i < n; i++) {
			result2 += i;
		}
		System.out.println(result2);
		// 응용 - 개인적 공부
		Scanner scan = new Scanner(System.in);		
		int x = scan.nextInt();
		int result3 = 0;
		for(int i = 0; i < x; i++) {
			result3 += i;
		}
		System.out.println(result3);
		
// 함수 이용		
		// 1 ~ 100 까지 합을 구하시오
		System.out.println(sumnum(100)); 
		// 1 ~ n 까지 합을 구하시오
		int n2 = 200;
		System.out.println(sumnum(n2));
		// 응용 - 개인적 공부
		Scanner scan2 = new Scanner(System.in);
		System.out.print(sumnum(scan2.nextInt()));

	}
// 함수 생성
	public static int sumnum(int x) {
		int result = 0;
		for(int i = 0; i < x; i++) {
			result += i;
		}
		return result;
	}
	
}
