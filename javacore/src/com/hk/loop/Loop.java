package com.hk.loop;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// 예제) 1 ~ 10 다 더해보시오.
/*
		int sum = 0;
		int i = 0;
		
		for(i = 0; i < 11; i++) {
			sum += i;
		} System.out.println("누적합은(1~10) : " + sum);
*/	
		// 2 4 6 8 10 .... 20
/*
		int y = 2;
		int sum1 = 0;
		
		for(int i = 0; i < 10; i++) {
			sum1 += y;
			y += 2;
		} System.out.println("짝수합(2~20) : " + sum1);
*/	
		// 1 * 3 * 5 * 7 * 9 .... 19
/*		
		int sum2 = 1;
		
		for(i = 0; i < 20; i++) {
			if (i%2==1) {
				sum2 *= i;
			}
		}System.out.println(sum2);
*/	
		// 키보드 입력을  5번 반복해서 받으시오.
		// 숫자를 입력하면 sum 에 모두 더하시오.
		// ex) sum = 234 + 345 + 344 + ...
/*	
		Scanner scan = new Scanner(System.in);
		
		int res = 0;
		int sum3 = 0;
		
		for(i = 0; i < 5; i++) {
			res = scan.nextInt();
			sum3 += res;
		} System.out.println(sum3);
*/		
		// 연습문제) 3번 입력 받음 (반복문) 영어, 불어, 자바
		//		    입력한 숫자의 평균을 구해보시오. (정수로 출력)
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int res2 = 0;
		int sum4 = 0;
		int avg = 0;
		
		for(i = 0; i < 1; i++) {
			for(int j = 0; j < 1; j++) {
				System.out.print("영어점수 ? : ");
				res2 = scan.nextInt();
				sum4 += res2;
			}
			for(int k = 0; k < 1; k++) {
				System.out.print("불어점수 ? : ");
				res2 = scan.nextInt();
				sum4 += res2;
			}
			for(int m = 0; m < 1; m++) {
				System.out.print("자바점수 ? : ");
				res2 = scan.nextInt();
				sum4 += res2;
			}
			avg = sum4/3;
		} System.out.println("평균점수 ? : " + avg);
		
		// 선생님 코드 
		
		int score = 0;
		int sum = 0;
		int cnt = 0;
		int avgr = 0;
		
		for(i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 과목점수는 ? ");
			score = scan.nextInt();
			sum += score;
			cnt++;
		}
		System.out.println(sum); // 중간평가
		// 평균은 ?
		avgr = sum/cnt;
		System.out.println("영어, 불어, 자바의 평균점수는 ? " + avgr);
	}
}
