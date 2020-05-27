package com.hk.array;

public class Array3D {

	public static void main(String[] args) {
		// int[][][] scores = new int[3][4][2]; // 총 24개 
		// 1 ~ 3반 4명의 국어, 불어 점수
		int[][][] scores = {
				{ // 1
					{100,70},
					{90, 60},
					{90, 80},
					{100, 70} 
				},
				{ // 2
					{90,80},
					{80, 70},
					{90, 70},
					{80, 80} 
				},
				{ // 3
					{80,70},
					{90, 70},
					{100, 80},
					{80, 80} 
				}
		};
		// 초기값 확인
		for(int z = 0; z < 3; z++) {
			for(int r = 0; r < 4; r++) {
				for(int c = 0; c < 2; c++) {
					System.out.print(scores[z][r][c] + " ");
				}System.out.println();
			}
		}
		// 1반부터 3반까지 국어점수의 총합을 구하여라.
		int sum = 0; // 총합
		for(int z = 0; z < 3; z++) {
			for(int r = 0; r < 4; r++) {
					sum += scores[z][r][0]; // 0은 국어, 1은 불어
				
			}
		}System.out.print("1반부터 3반까지 국어점수의 총합은 " + sum + " ");
	}
}
