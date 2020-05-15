package exam3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		/* 연습문제
		1. 점수를 입력하세요
		
		2.
		90점 이상 A -> 95점 이상이면 A+
		80점 이상 B -> 85점 이상이면 B+
		70점 이상 C -> 75점 이상이면 C+
		60점 이상 D -> 65점 이상이면 D+
		
		3. 결과 출력
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 시험 점수를 입력하시오. : ");
		int score = scan.nextInt();
		
//		if(score >= 90) {
//			if(score >= 95) {
//				System.out.println("당신의 평점은 A+입니다.");
//			}else System.out.println("당신의 평점은 A입니다.");
//		}else if(score >= 80) {
//			if(score >= 85) {
//				System.out.println("당신의 평점은 B+입니다.");
//			}else System.out.println("당신의 평점은 B입니다.");
//		}else if(score >= 70) {
//			if(score >= 75) {
//				System.out.println("당신의 평점은 C+입니다.");
//			}else System.out.println("당신의 평점은 C입니다.");
//		}else if(score >= 60) {
//			if(score >= 65) {
//				System.out.println("당신의 평점은 D+입니다.");
//			}else System.out.println("당신의 평점은 D입니다.");
//		}else System.out.println("당신의 평점은 F입니다. 낙제 축하드립니다.");

		String message = "";
		if(score >= 90) {
			if(score >= 95) {
				message = "A+";
			}else message = "A";
		}else if(score >= 80) {
			if(score >= 85) {
				message = "B+";
			}else message = "B";
		}else if(score >= 70) {
			if(score >= 75) {
				message = "C+";
			}else message = "C";
		}else if(score >= 60) {
			if(score >= 65) {
				message = "D+";
			}else message = "D";
		}else message = "F";

		System.out.println("당신의 평점은 " + message + "입니다.");
		
	}

}
