package com.hk.conditional;

import java.util.Scanner;

public class SelectMenu {

	public static void main(String[] args) {
//		숫자로 메뉴를 선택하는 경우
//		1번 중식 - 짜장면
//		2번 일식 - 회덮밥
//		3번 양식 - 돈까스
//		4번 기타 - 스파게티
/*		
		1) if 문으로 구현
		2) switch 문으로 전환 
*/
		int menu = 0;
		String result = "선택안함";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("저녁에 먹고 싶은 메뉴 번호는 ? : ");
		menu = scan.nextInt();
		
		if(menu==1) {
			result = "중식 짜장면";
		}else if(menu==2) {
			result = "일식 회덮밥";
		}else if(menu==3) {
			result = "양식 돈까스";
		}else if(menu==4) {
			result = "기타 스파게티";
		}else result = "선택안함";
		
		System.out.println("오늘 저녁식사는 ? " + result);
		

		
	}

}
