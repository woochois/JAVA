package com.hk.app4;

import java.util.Random;
import java.util.Scanner;

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

		  
		  //------------------------------------- 다음 날 수업 ----------------------------------------------- 
		  
		  // while 복습 
		  // [연습 예제] // 1 ~ 100 까지 누적합
		  // 1 2 3 4 5 ... 100 = 5050 
		  // 합이 100 넘는 순간 멈추고 
		  // 결과값, 넘는 순간 ?
		  
		  int sumr = 0; // 최종합 저장 
		  int xr = 1; // 1 -> 계속 간다 +1 
		  System.out.println(xr + " - " + sumr + "시작값"); 
		  System.out.println("-----------------"); 
		  while(true) { // 참이면 무한 루프
		  
			  sumr += xr;
			  System.out.println(xr + " - " + sumr);
		      if(sumr>=100) break; 
			  xr++; 
			  }
		  
		  // [연습 예제] 무한루프를 돌다가 sum = 1,000,000,000 원 
		  // 하루에 2220,000원 sum = 0 멈춤 
		  // 몇번째 멈추는가?
		  
		  int bank = 1000000000; // 10억 
		  int consume = 2220000; 
		  int day = 1;	  // 하루 평균 222만원 사용
		  
		  while(true) { bank -= consume;
		  
		  if(bank <= 0) { break; } System.out.println(day + "일 " + bank); day++; }
		  
		  // Continue
		  
		  for(int i1 = 1; i1 <= 100; i1++) { if(i1%3==0)continue;
		  if(i1%10==0)System.out.println("순서=짝짝"); else System.out.println("순서="+i1);
		  if(i1>30) break; }
		 
		// break문 : 반복문을 멈추는 역할
		// continue문 : 반복문을 전부 돌지만 조건에 따라 건너뜀
		// 1 ~ 100까지 짝수를 합
		// 방법 1. %
		// 방법 2. %, continue

		// 방법 1.
		int sum1 = 0;
		for (int i1 = 0; i1 <= 100; i1++) {
			if (i1 % 2 == 0)
				sum1 += i1;
		}
		System.out.println(sum1);

		int num1 = 0;
		int tot1 = 0;
		while (true) {
			if (num1 % 2 == 0) {
				tot1 += num1;
				num1++;
			}
			break;
		}
		System.out.println(tot1);

		// 방법 2.
		int sum21 = 0;
		for (int i1 = 0; i1 <= 100; i1++) {
			if (i1 % 2 == 1) {
				continue;
			}
			sum21 += i1;
		}
		System.out.println(sum21);

		// 1 ~ 100까지 반복 (int i를 사용해서)
		// 2의 배수 또는 3의 배수가 아니면 건너뛰고 3의 배수는 더해주고
		int sum3 = 0;
		for (int h = 1; h <= 100; h++) {
			if (h % 2 == 0 || h % 3 != 0) continue;
			sum3 += h;
		}
		System.out.println(sum3);
		
		// do while문
		// 입력을 반복해서 받는데 입력값이 0이면 프로그램 종료

		int test = 0;
		int input = 0;
		Scanner scan = new Scanner(System.in);

		while(input != 0) {
			System.out.print("숫자를 입력하시오. : ");
			input = scan.nextInt();
			test += input;
		}System.out.println("결과는 : " + test);

		int snum = 0;
		int input2 = 10;
		
		do {
			System.out.print("정수를 입력하시오. : ");
			input2 = scan.nextInt();
			snum += input2;
		} while(input2 != 0); // 조건 식이 뒤에 붙음
		System.out.println(snum);

		// [연습 예제]
		// 세자리의 숫자를 만들려고 합니다.
		// 123, 234, 567, ... 가능 - 131, 224, 555, ... 중복값이 하나라도 있으면 불가능
		// 100 * x , 10 * y , 1 * z - 3개의 숫자를 랜덤

		Random ran2 = new Random();
		
		int xx = 0; // 100의 자리
		int yy = 0; // 10의 자리
		int zz = 0; // 1의 자리
		
		while(true){
			xx = ran.nextInt(9) + 1; // (1 ~ 9)
			yy = ran.nextInt(9) + 1; // (1 ~ 9)
			zz = ran.nextInt(9) + 1; // (1 ~ 9)

			if(xx != yy && yy != zz && zz != xx) {
				xx *= 100;
				yy *= 10;
				zz *= 1;
				System.out.println(xx + yy + zz);
			}
			
			if (xx == yy && yy == zz && zz == xx) {
				break;
			}
			
		}
		
		// 강사님 코드
		
		int x1 = 0;
		int y1 = 0;
		int z1 = 0;
		Random zen = new Random();
		while(true) {
			x1=zen.nextInt(9)+1;
			y1=zen.nextInt(9)+1;
			z1=zen.nextInt(9)+1;
			if(x1!=y1&&y1!=z1&&y!=z1) {
				break;
			}
		}
		System.out.println(""+x1+y1+z1);

		int x2 = 0;
		int y2 = 0;
		int z2 = 0;
		Random zen2 = new Random();
		
		do {
			x2=zen.nextInt(9)+1;
			y2=zen.nextInt(9)+1;
			z2=zen.nextInt(9)+1;
		}while(x2==y2||y2==z2||z2==x2);
		System.out.println(""+x2+y2+z2);
		
		// x 하나만 랜덤 수로 생성 후, x 와 y, z 를 비교해서 코드 간결화 시켜보기
		
		
	}

}
