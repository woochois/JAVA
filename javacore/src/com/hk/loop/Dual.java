package com.hk.loop;

public class Dual {

	public static void main(String[] args) {
		
		// 구구단 출력
/*
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
*/	
		// ***** 반복문 출력
/*
		String star = "*";
		
		for(int i = 0; i < 5; i++) {
			System.out.print(" ");
			for(int j = 0; j < 5; j++) {
				System.out.print(star);
			}
		}
*/	
		// x = 1 3 5 7 9
		// y = 2 4 6 8 10
		
		for(int x = 1; x < 10; x++) {
			x += 1;
			for(int y = 1; y < 10; y++) {
				System.out.print(x * y + " ");
				y += 1;			
			}System.out.println("");
		}
		
		
		// 줄 나누기
		System.out.println(" ");
		
		// 선생님 코드
		
		int x = 0;
		int y = 0;
		int mux = 1;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				x = (i+1) * 2;
				y = (j*2) + 1;
				mux = x * y;
				System.out.print(mux + " ");
			}
			System.out.println("");
		}

	}
}
