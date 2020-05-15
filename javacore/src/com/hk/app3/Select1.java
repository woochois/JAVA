package com.hk.app3;

import java.util.Scanner;

public class Select1 {
	public static void main(String[] args) {
		// score = ? 70점 이상 합격, 미만 불합격
		
		// 내 코드
//		Scanner scan = new Scanner(System.in);
//		System.out.print("점수를 입력하시오. : ");
//		int score = scan.nextInt();
//		if(score >= 70) System.out.println("합격을 축하드립니다.");
//		else System.out.println("아쉽지만 불합격입니다.");
//		
		// 선생님 코드
		String message = "";
		int score = 75;
		if(score >=70) {
			message="합격을 축하합니다.";
		}else {
			message="불합격 힘내세요.";
		}
		System.out.println(message);
	}
}
