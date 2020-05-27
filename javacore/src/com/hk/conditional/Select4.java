package com.hk.conditional;

import java.util.Scanner;

public class Select4 {
	public static void main(String[] args) {
		
//		선생님 코드
		/*
		int age = 0; // 나이
		char mil =' '; // 공군 a , 해군 m , 육군 g
		String mi = "";
		// 입력
		age = 30; // 김건우
		mil = 'a';
		// 나이가 18세 미만 mil = ' '; -> 청소년이고 미필입니다.
		// 나이가 18세 이상 mil = 'a' or 'm' or 'g'; -> 성인이고 군필입니다.
		// 나이가 18세 이상 mil = ' '; 성인이고 미필입니다.
		if(age>18 && mil!=' ') {
			System.out.println("성인이고 군필");
		}else if(age>=18 && mil==' ') {
			System.out.println("성인이고 미필");
		}else {
			System.out.println("청소년임");
		}
		

		if(age>18 && mi.equalsIgnoreCase("")) { // !mi.equals("")
			System.out.println("성인이고 군필");
		}else if(age>=18 && mi.equals("")) {
			System.out.println("성인이고 미필");
		}else {
			System.out.println("청소년임");
		}
		
//		중첩 if문
		if(age>18 && mil!=' ') {
			if(mil=='a') {
				System.out.println("성인이고 군필");
			}else if(age>=18 && mil==' ') {
				System.out.println("성인이고 미필");
			}else {
				System.out.println("청소년임");
			}
		}else if(age>=18 && mil==' ') {
			System.out.println("성인이고 미필");
		}else {
			System.out.println("청소년임");
		}
		*/
		
		// 응용 ) 내 코드
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("군인 분별 시스템\n나이를 입력하시오. : ");
		int ag = scan.nextInt();
		if(ag>=18) {
			System.out.printf("군필 분별 시스템\n공군 : a, 해군 : m, 육군 : g 중 본인이 나온 곳을 입력하시오.\n*군대를 다녀오지 않으셨다면 아무거나 입력하세요. ");
			String mili = scan.nextLine();
			String message = "";
			
			if(ag>=18 && mili.equals("a")) {
				message = "공군";
			}else if(ag>=18 && mili.equals("m")) {
				message = "해군";
			}else if(ag>=18 && mili.equals("g")) {
				message = "육군";
			}else message = "미필";
			
			System.out.println("성인이시고 " + message + "출신이시군요.");
			
		}else System.out.println("청소년이시군요.");
		
//		switch 문
		/*
		switch(mil) {
			case 'a': System.out.println("성인이고 공군 군필");
				break;
			case 'm' : System.out.println("성인이고 해군 군필");
				break;
			case 'g' : System.out.println("성인이고 육군 군필");
				break;
			default :
				break;
		} */
		

		
		
	}
}
