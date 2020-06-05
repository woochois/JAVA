package exam7;

import java.util.Random;
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
/*		
		6. 두 자리의 숫자를 랜덤하게 생성하여 배열 num에 저장하고
		(자리 숫자가 중복되지 않게)
		키보드를 통해 두 자리의 숫자를 입력받는다(자리 숫자가 중복되거
		나 두 자리가 아니면 다시 입력받음)
		랜덤핚 숫자와 입력핚 숫자를 비교하여 랜덤핚 숫자가 입력핚 숫자
		보다 큰지 작은지를 출력하고 숫자가 같아질 때까지 반복핚다
		숫자가 같아지면 입력횟수와 맞춘 숫자를 출력하시오
*/		

		// 선생님 코드	
		//1
		int[] num1 = new int[2]; // 컴퓨터의 두 개의 수 받아오는 배열 2칸
		Random zen = new Random(); // 랜덤 수
		int count = 0; // 돌린 횟수
		
		while(true) {
			num1[0] = zen.nextInt(9)+1; //1-9 : 10의 자리
			num1[1] = zen.nextInt(10);  //0-9 : 1의 자리 
			if(num1[0]!=num1[1]) { // 중복되는 수가 아니면 컴퓨터 수 확정
				break;
			}
		}
		System.out.println("컴퓨터 랜덤 숫자=" + (num1[0]*10+num1[1])); // 컴퓨터의 랜덤 숫자
		
		//2
		int[] num2 = new int[2]; // 사용자의 두 개의 수 받아오는 배열 2칸
		Scanner scan1 = new Scanner(System.in);
		int input = 0; // 기본 입력값
		
		while(true) // 정답을 맞출 때까지 반복
		{
			while(true) { // 중복되는 숫자 분별
				// 사용자 입력
				System.out.print("두 자리숫자를 입력하시오=");
				input = scan1.nextInt();
				
				// 10의 자리 수와 1의 자리 수 비교
				num2[0] = input / 10; // 10의 자리 ex) 21 / 10 = 2
				num2[1] = input % 10; // 1의 자리  ex) 21 % 10 = 1 
				
				if(input > 9 && input < 99) // 사용자가 입력한 값의 범위 판별 ( 한 자리 수, 세 자리 수가 아니면)
				{					
					if(num2[0]!=num2[1]) {  // 10의자리와 1의자리 중복값 판별
						count++; // 돌린 횟수 증가
						break;
					}else {
						System.out.println("다시 입력하시오"); // 10의자리와 1의자리 중복되면
						count++; // 돌린 횟수 증가
					}
				}else {
					System.out.println("다시 입력하시오"); // 한 자리 수 거나 세 자리 수면
					count++; // 돌린 횟수 증가
				}
			}
			
			//3
			if(num1[0]*10+num1[1] > input) {
				System.out.println(input + " 보다 컴퓨터 랜덤숫자가 큽니다!");
			}else if(num1[0]*10+num1[1] < input) {
				System.out.println(input + " 보다 컴퓨터 랜덤숫자가 작습니다!");
			}else {
				System.out.println("정답 맞습니다. \n 입력한 횟수 : " + count);
				break;
			}
		}	
		
		
	}
}
