package exam7;

import java.util.Scanner;

public class Exam7 {
	public static void main(String[] args) {
/*		
		1. 다음을 수행하는 배열 선언문을 작성하라
		⚫ 10개의 정수 값들을 저장하는 배열 num
		⚫ 달(month) 의 이름들을 저장하는 배열 month
		⚫ 학점을 저장하는 배열 grade
		⚫ 진리값 (true 나 false)를 저장하는 배열 logic
*/
		int[] num = new int[10];
		int[] month = new int[12];
		double[] grade = new double[1];
		boolean[] logic = new boolean[2];
/*
		2. 1 부터 10까지를 저장할 정수형 배열 no 을 만들어서 대입하고
		각각을 서로 곱한 값을 출력하라
*/	
		int[] no = new int[10];
		for(int i = 1; i < 10; i++) {
			no[i] += i;
			no[i] *= i;
			System.out.print(no[i] + " ");
		}
		System.out.println(" ");
/*	
		3. A 부터 F 까지를 저장할 문자형 배열을 만들어서 대입하고 각각
		의 값을 출력하라
*/	
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + " ");
		}
		System.out.println(" ");
/*		
		4. Java, oracle, css, spring, project 를 저장할 문자열 배열 subject
		을 만들어서 대입하고 각각의 값을 출력하라
*/	
		String[] subject = {"Java", "oracle", "css", "spring", "project"};
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ");
		}
		System.out.println(" ");
/*		
		5. 5개의 문자를 입력받아서 1번째 3번째 5번째 입력받은 문자를
		차례로 출력하는 프로그램을 작성하시오.
		(단 입력받은 문자는 문자형 배열에 저장한다)
*/	
		Scanner scan = new Scanner(System.in);
		String[] pr = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("문자를 입력하시오. : ");
			String input = scan.next(); 
			pr[i] = input;
		}System.out.print(pr[0] + " " + pr[2] + " " + pr[4]);
		
	}
}
