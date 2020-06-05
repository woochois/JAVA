package com.hk.exception;

public class ExceptArray1 {
	public static void main(String[] args) {
		
		// 배열 선언
		int[] score = new int[5]; // 토익 점수 0 ~ 4
		
		// 점수별로 확인하려면 반복문
		// 예외가 발생할 것 같다고 생각되면
		try {
			for(int i = 0; i < 10; i++) {
				int test = score[i]; // 5 6 7 8 ...
			}
		} catch (Exception e) {
			System.out.println("에러 발생 : " + e);
		}
		System.out.println("sdfslkdflkds");
	}
}
