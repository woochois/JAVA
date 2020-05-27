package com.hk.array;

import java.util.Random;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		/*
		배열활용
		반복문 값을 처리
		로또
		정수배열[10], 랜덤한 숫자를 입력 ArrRandom
		ran[0] = 1 ~ 10 (중복돼도 상관없음)
		...
		ran[9] 홀수와 짝수를 분리해서 출력
		*/
	
		// 정수배열생성
		int[] ArrRandom = new int[10];
		// 랜덤값
		Random ran = new Random();
		// |0|1|2|3|4|5|6|7|8|9|
		for(int i = 0; i < ArrRandom.length; i++) {
			ArrRandom[i] = ran.nextInt(10) + 1;
			System.out.print(ArrRandom[i] + " ");
		}
		
		System.out.println(); // 가독성을 위해 한 칸 뛰기
		
		for(int i = 0; i < ArrRandom.length; i++) {
			if(ArrRandom[i]%2==0) System.out.print(ArrRandom[i] + " ");
		}
		
		System.out.println(" "); // 가독성을 위해 한 칸 뛰기
		
		for(int i = 0; i < ArrRandom.length; i++) {
			if(ArrRandom[i]%2==1) System.out.print(ArrRandom[i] + " ");
		}
		
		System.out.println(); // 가독성을 위해 한 칸 뛰기
		
		// 다차원 배열
		// 1차원 선언 : String[] name = new String[10];
		// 2차원 선언 : String[][] name = new String[10][5];
		
		// 2차원 배열 초기화
		int[][] score = {{100,100,100}, {50,50,50}, {70,70,70}, {80,80,80}}; // new int[4][3]
		score[0][0] = 100;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++)
				score[i][j] = 10;
		}
		
		// 행(r), 열(c)
		int[][] score2 = { // int[][] score2 = new int[5][3];
			   // 0   1   2
				{100,100,100}, // 0
				{50,50,50},	   // 1
				{70,70,70},	   // 2
				{80,80,80},	   // 3
				{60,60,60}};   // 4
		
		// 국어점수만 출력
		int c = 0;
		for(int r = 0; r < 5; r++) {
			System.out.print(score2[r][c] + " "); 
		
		System.out.println(); // 가독성을 위해 한 칸 뛰기
		}
		// 2+1번 학생의 국, 영, 수 점수 출력
		int r1 = 2;
		for(int cc = 0; cc < 3; cc++) {
			System.out.print(score2[r1][cc] + " ");
		}
		System.out.println(); // 가독성을 위해 한 칸 뛰기
		
		// 전체출력
		for(int rr = 0; rr < 5; rr++) {
			for(int cc = 0; cc < 3; cc++) {
				System.out.print(score2[rr][cc] + " ");
			}
			System.out.println(); // 가독성을 위해 한 칸 뛰기
		}
		
		for(int rr = 0; rr < score2.length; rr++) {
			for(int cc = 0; cc < score2[3].length; cc++) {
				System.out.print(score2[rr][cc] + " ");
			}
			System.out.println(); // 가독성을 위해 한 칸 뛰기
		}
		
		
		// 고정 컬럼 배열
		int[][] score3 = new int[5][5];
		
		// 가변 컬럼 배열
		int[][] score4 = new int[5][]; // row = 5개
		score4[0] = new int[4]; // col = 4개
		score4[1] = new int[3]; // col = 3개
		score4[2] = new int[3]; // col = 3개
		score4[3] = new int[3]; // col = 3개
		score4[4] = new int[1]; // col = 5개
		
		// 배열의 복사
		int[] src = {1,2,3,4,5};
		int[] des = new int[10];
		
		// 1 2 3 4 5 0 0 0 0 0
		for(int i = 0; i < src.length; i++) {
			des[i] = src[i];
		}
		for(int i = 0; i < des.length; i++) {
			System.out.print(des[i] + " ");
		}
		
		System.out.println();
		
		// 0 0 0 0 0 1 2 3 4 5
		for(int i = 0 ; i < src.length; i++) {
			des[i+5] = src[i]; // index 벗어나면 오류
		}
		for(int i = 0; i < des.length; i++) {
			System.out.print(des[i] + " ");
		}System.out.println();


		int[] src2 = {1,2,3,4,5};
		int[][] des2 = new int[5][5];
		
//		0 0 0 0 0
//		0 0 0 0 0
//		1 2 3 4 5
//		0 0 0 0 0
//		0 0 0 0 0
		for(int i = 0; i < 5; i++) {
			des2[2][i] = src2[i]; 
		}
		
		for(int m = 0; m < des2.length; m++) {
			for(int n = 0; n < des2[0].length; n++) {
				System.out.print(des2[m][n] + " ");
			}System.out.println();
		}
		
		System.out.println();
	
//		0 0 0 0 1
//		0 0 0 0 2
//		0 0 0 0 3
//		0 0 0 0 4
//		0 0 0 0 5
		for(int i = 0; i < 5; i++) {
			des2[i][4] = src2[i];
		}
		
		for(int m = 0; m < des2.length; m++) {
			for(int n = 0; n < des2[0].length; n++) {
				System.out.print(des2[m][n] + " ");
			}System.out.println();
		}
		
		System.out.println();
		
		int[] des3 = new int[10];
		
		System.arraycopy(src2, 0, des3, 0, 5);
		
		for(int i = 0; i < des3.length; i++) {
			System.out.print(des3[i] + " ");
		}
		
//		1. 1반부터 6반까지의 int[] avg 평균점수를 저장한 후, 
//		(반별 평균점수는 초기값으로 1반부터 차례로 85 79 83 80 78 75로 초기화한다)
//		두 반의 반 번호를 입력받아 두 반 평균 점수의 합을 출력하는 프로그램을 작성하시오.
//		[키보드 입력 예]
//		첫 번째 반 : 1
//		두 번째 반 : 3
//		(주의점 : 반 번호, 배열 번호 다름)
//		두 반의 평균점수 합은 : 168
	
		// 반별 평균점수 초기값
		int[] avg = {85, 79, 83, 80, 78, 75};
		// 두 반의 반 번호 입력
		Scanner scan1 = new Scanner(System.in);
		// 두 반 평균 점수의 합
		while(true) {
			// 첫 번째 반 번호 입력
			System.out.print("첫 번쨰 반 번호 입력 : ");
			int i = scan1.nextInt();
			// 두 번째 반 번호 입력
			System.out.print("두 번쨰 반 번호 입력 : ");
			int j = scan1.nextInt();
			if(i != j) { // 입력된 두 반이 같지 않으면
					int sum = avg[i-1]; // 배열의 주소값은 0에서부터 시작
					int sum2 = avg[j-1]; // 배열의 주소값은 0에서부터 시작
					System.out.println("두 반의 평균점수 합은 : " + (sum+sum2));
					break;
			} else System.out.println("같은 반입니다. 다시 입력해주세요."); // 같은 반 입력했을 시 다시 입력
		}
	}
}
