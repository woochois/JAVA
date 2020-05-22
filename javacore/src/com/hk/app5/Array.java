package com.hk.app5;

public class Array {

	public static void main(String[] args) {
/*		
		// 6강 배열 (1차원)
		// 변수 선언 int x; -> { }
		// 배열 선언 int[]y = new int[5]; -> { } { } { } { } { } : 일련된 순서, 같은 타입만
		// 배열은 초기화를 시켜주는 게 좋다.
		
		// 점수배열, 학생명배열
		// 배열 선언 방법
		int x; // 메모리 자동생성
		String y; // 메모리 자동생성
		
		int[] score = new int[5]; //
		String[] name = new String[5]; //
		
		// 연습으로 배열 선언 + 생성
		// 실수배열 5개
		// 논리배열 5개
		// 문자배열 5개
		Double[] d; // 개수를 모르기 때문에 쓸 수가 없다. = 메모리 사이즈를 모르기 때문에 값을 넣을 수가 없다.
		Boolean[] b; // 개수를 모르기 때문에 쓸 수가 없다.
		char[] c;  // 개수를 모르기 때문에 쓸 수가 없다.
		
		Double[] tall = new Double[5];
		Boolean[] gender = new Boolean[5];
		char[] mil = new char[5];
		
		// 가상 동물원
		// 사자 한 마리 (다리 개수, 이름, 몸무게, 성별)
		int Lleg = 4;
		String Lname = "킹";
		double Lweight = 300.0d; // kg
		char Lgen = 'm';
		
		// 원숭이 세 마리 (다리 개수(팔+다리), 이름, 몸무게, 성별)
		int[] Mleg = new int[3];
		String[] Mname = new String[3];
		double[] Mweight = new double[3];
		char[] Mgen = new char[3];
		
		// 배열의 초기화
		
		// 1. 인덱스 값에 일일이 순서대로 수동 입력. <- 노가다
		Mleg[0] = Mleg[1] = Mleg[2] = 4;
		Mname[0] = "몽1";
		Mname[1] = "몽2";
		Mname[2] = "몽3";
		Mweight[0] = 200.0d;
		Mweight[1] = 170.0d;
		Mweight[2] = 150.0d;
		Mgen[0] = 'm';
		Mgen[1] = 'f';
		Mgen[2] = 'm';
		
		// 2. 중괄호 안의 값 만큼.
		// 독수리가 두 마리 (날개 개수, 이름, 몸무게, 성별)
		double[] Ewing = {2, 2}; // 0, 1 - 2개씩 (2마리)
		String[] Ename = new String[3];
		double[] Eweight = new double[3];
		char[] Egen = {'m', 'f'};
		
		// 3. 반복문을 사용한 방법.
		int[] number = new int[5];
		for(int i = 0; i < 5; i++) {
			number[i] = i + 1; // 1 2 3 4 5
		};
		
		// [예제] 짝수배열 1 ~ 20 까지 짝수값을 대입 (총 10개)
		int[] even = new int[10];
		for(int j = 0; j < 11; j++) {
			even[j] = (j + 1) * 2;
			System.out.println(even[j]);
		};

		// 과학 점수배열 선언하고 score2
		// { 100, 70, 60, 80, 90, 100 }
		int[] score2 = { 100, 70, 60, 80, 90, 100 };
		// 각각  출력
		for(int xx = 0; xx < 6; xx++) {
			System.out.println(xx + "번째 학생 과학점수 : " + score2[xx]);
		}
		
		
		// 배열의 사이즈 구하기
		for(int yy = 0; yy < score2.length; yy++) {
			System.out.println(yy + "번째 배열값 : " + score2[yy]);
		}
		
		// 국어 점수배열 선언하고 score3
		// { 100, 70, 60, 80, 90, 100 }
		int[] score3 = { 100, 70, 60, 80, 90, 100 };
		int sum = 0;
		// 각각  출력
		System.out.println("배열의 사이즈 : " + score3.length );
		for(int xxx = 0; xxx < score3.length; xxx++) {
			System.out.println(xxx + "번째 학생 국어점수 : " + score3[xxx]);
			sum += score3[xxx];
		}
		System.out.println("국어 점수 총합은 : " + sum);
		
		// 배열을 사용하지 않고 기본 정수변수로 합계 구하기
		int s1 = 100;
		int s2 = 70;
		int s3 = 60;
		int s4 = 80;
		int s5 = 90;
		int s6 = 100;
		int sum2 = s1 + s2 + s3 + s4 + s5 + s6;
		
		for(int k = 0; k < 1; k++) {
			System.out.println(sum2);
		}
		
		while(true) {
			System.out.println(sum2);
			break;
		}
		
		do {
			System.out.println(sum2);
		}while(false);
*/
		int[] ball = new int[45];
		for(int g = 0; g < ball.length; g++) ball[g] = g + 1;
		int temp = 0;
		int e = 0;
		for(int g = 0; g < 100; g++){
			e = (int)(Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[e];
			ball[e] = temp;
		}
		for(int g = 0; g < 6; g ++) System.out.print(ball[g] + " ");
		
		
	}

}
