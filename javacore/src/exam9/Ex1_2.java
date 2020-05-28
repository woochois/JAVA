package exam9;

import java.util.Scanner;

public class Ex1_2 {
	
	// 1-2 위의 함수의 파라미터에 숫자를 입력 받아서 횟수 만큼 출력하는 함수로 변경하시오
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력할 횟수는 : ");
		System.out.print(javafunction(scan.nextInt()));
	}
	
	static int javafunction(int a) {
		
		for(int i = 0; i < a; i++) {
			System.out.println(" Java Function ");
		}
		return  a;	
	}
}
