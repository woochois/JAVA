package com.hk.app5;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		// var 선언
		int[][] map = new int[5][5];
		int k = 1; // 대입할 값
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				map[i][j] = k;
				System.out.print(map[i][j] + " ");
				k++;
			}System.out.println(); // 줄바꿈
		}
		
		System.out.println(); // 줄바꿈
		
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 5; x++) {
				if(map[y][x] <= 9) System.out.print("0" + map[y][x] + " ");
				else System.out.print(map[y][x] + " ");
			}
			System.out.println(); // 줄바꿈
			
		}
		
		System.out.println();
		
		// 더 공부하자. 아직 많이 부족하다.
		
		// 홀수 - 증가
		// 짝수 - 감소
		for(int y = 0; y < 5; y++) {
			if(y%2==0) {
				for(int x = 0; x < 5; x++) { // ++
					if(map[y][x] <= 9) System.out.print("0" + map[y][x] + " ");
					else System.out.print(map[y][x] + " ");
				}
			}else {
				for(int x = 4; x >= 0; x--) { // --
					if(map[y][x] <= 9) System.out.print("0" + map[y][x] + " ");
					else System.out.print(map[y][x] + " ");
				}
			}System.out.println();
		}
		
		System.out.println();
		
		// 홀수 - 감소
		// 짝수 - 증가
		for(int y = 0; y < 5; y++) {
			if(y%2==1) {
				for(int x = 0; x < 5; x++) { // ++
					if(map[y][x] <= 9) System.out.print("0" + map[y][x] + " ");
					else System.out.print(map[y][x] + " ");
				}
			}else {
				for(int x = 4; x >= 0; x--) { // --
					if(map[y][x] <= 9) System.out.print("0" + map[y][x] + " ");
					else System.out.print(map[y][x] + " ");
				}
			}System.out.println();
		}
		
		
		// 컴퓨터 배열에서 일반 수학의 x축과 y축은 반대개념. 잊지말자.
		
		Scanner scan = new Scanner(System.in);
		int n = 0; // 임의의 수 
		
		while(true) { // 짝수가 아닌 임의의 홀수 n 반환
			System.out.print("마방진의 차수를 입력하시오. : ");
			n = scan.nextInt();
			if(n % 2 != 0) {
				break;
			} else System.out.println("홀수가 아닙니다.");
		}
		
		int array[][] = new int[n][n]; // 배열에 임의의 홀수 삽입
		int x = n/2; // 마방진의 시작점 (맨 윗행 중간열) 
		int y = 0;
		
		for(int i = 1; i <=  n * n; i++) {
				array[x][y] = i; // x 1열의 가운데 수는 1이다.
				if(i % n == 0) { // n 의 배수일 경우 바로 아래 행에 다음 수
					x++; // 다음 수
					if(x == n) x = 0; // x축을 벗어나면 x축 반대쪽 끝에 다음 수
				}else {
					x--; // 위로 이동
					y++; // 오른쪽으로 이동 다음 수
					if(x == -1) x = n - 1; // x축을 벗어나면 x축 반대쪽 끝에 다음 수 
					if(y == n) y = 0; // y축을 벗어나면 y축 반대쪽 끝에 다음 수
				}
		}
		
		for(x = 0; x < n; x++) { // 반복문 사용 - 수  삽입 (x축)
			for(y = 0; y < n; y++) { // 반복문 사용 - 수  삽입 (y축)
				if(array[y][x] <= 9) System.out.print(" " + array[y][x] + " ");
				else System.out.print(array[y][x] + " ");
			}System.out.println();
		}
		
//		1. 중첩 반복문을 사용하여 삼각형을 작성하시오. 5x5 행렬 사용
		
		String[][] triangle = new String[5][5];
		
		for(int i = 0; i < triangle.length; i++) {
			for(int j = 0; j < i + 1; j++) {
				triangle[i][j] = "*";
				System.out.print(triangle[i][j] + " ");
			}System.out.println();
		}
	
	}

}
