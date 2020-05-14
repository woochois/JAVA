package com.hk.app1;
import java.util.*;
public class Exam3 {

	public static void main(String[] args) {
		
//		int x,y,z = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫 번째 정수는 ? ");
//		x = scan.nextInt();
//		System.out.print("두 번째 정수는 ? ");
//		y = scan.nextInt();
//		z = x*y;
//		System.out.print("정답은 ? ");
//		System.out.print(z);
		
//		double C = 0;
//		double F = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("섭씨 온도를 화씨 온도로 바꾸기");
//		System.out.print("섭씨 온도를 입력하시오. ");
//		C = scan.nextDouble();
//		F = 9.0 / 5.0 * C + 32;
//		System.out.println("화씨 온도는 : " + F);

//		Scanner scan = new Scanner(System.in);
//		System.out.print("회원명 : ");
//		String name = scan.nextLine();
//		System.out.print("이메일 주소 : ");
//		String email = scan.nextLine();
//		System.out.println(name);
//		System.out.println(email);
//		
//		scan.close(); // 가비지 컬렉션 -> 생략 가능
		
		// 영문 아이디 입력 저장
		// 영어 점수 입력 저장
		
		// 출력
		// 아이디 
		// -----------
		//
		
		String id;
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 아이디를 입력하시오 : ");
		id = scan.nextLine();
		System.out.print("토익 점수를 입력하시오 : ");
		score = scan.nextInt();
		
		System.out.println("아이디\t토익점수");
		System.out.println("-------------");
		System.out.println(id + "\t" +score);
	}

}
