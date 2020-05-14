package com.hk.app2;

import java.util.Scanner;

public class triple2 {

	public static void main(String[] args) {
		// 삼항연산자 연습
		// score = 키보드 입력 (0~100 중)
		// 삼항연산자 60 넘으면 pass, 60 미만이면 fail
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		String res = score > 60 ?  "pass" : "fail";
		System.out.println(res);
	}

}
