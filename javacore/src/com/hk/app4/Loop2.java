package com.hk.app4;

import java.util.Random;

public class Loop2 {

	public static void main(String[] args) {

		
		// while 문으로 1 ~ 100 까지 누적 합
		int sum = 0;
		int x = 1; // --> 100
		while (x <= 100) { // 1 ~ 100 참 , 101 거짓
			sum += x++;
			
		}
		System.out.println("1 ~ 100 까지의 합은 : " + sum);
		
		
		// [예제] 1 ~ 100 까지 3의 배수의 합 (while 문)
		int sum2 = 0;
		int y = 1;
		while(y <= 100) {
			if(y % 3 == 0) {
				sum2 += y;
			}
			y++;
		}
		System.out.println("1 ~ 100 까지 3의 배수의 합은 : " + sum2);
		
		// 중첩 while 문
		
		// [예제] 구구단 작성하기
		int res = 0, i = 2, j = 1;

		while(i < 10) {
			System.out.println(i + "단");
			j = 1; // j 초기화 필수 ( 이미 중첩 while 문 안에서 조건식인 (j < 10)을 만족했기 때문에 더이상 돌지 않음. )
			while(j < 10) {
				res = i * j;
				System.out.println(i + " x " + j + " = " + res);
				j++;
			}
			i++;
		}
		
//			[예제] Random 숫자 (0-9)
//			계속해서 숫자를 발생하다가
//			7이 나오면 반복을 중지하고 전부 출력
			Random ran = new Random();
		
			int rnum = 0;
			
			while(true) { // true 는 참이기 때문에 무한반복 (무한루프)
				rnum = ran.nextInt(10); // 0 ~ 9
				System.out.println(rnum);
				if(rnum == 7) break;
			}
			
			// [응용] 로또
			
			int n = 0;
			while(true) {
				rnum = ran.nextInt(44) + 1; // 1 ~ 45\
				n++;
				if(n == 7) break;
				System.out.print(rnum + " ");
			}
	}

}
 