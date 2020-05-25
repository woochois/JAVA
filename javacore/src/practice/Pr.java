package practice;

import java.util.Scanner;

public class Pr {
	public static void main(String[] args) {
		
		double rnum = Math.random(); // 랜덤값
		Scanner scan = new Scanner(System.in);
		int[] num = new int[2]; // 배열 2칸
		int answer = (int)(rnum * 99) + 10; // 랜덤값 제한 최소값 10 ~ 최대값 100
		int sum = 0; // 돌린 횟수
		
		while(true) {
			num[0] = scan.nextInt();
			num[1] = answer;
			if(num[0]!=num[1]) {
				break;
			}
		}
		System.out.println("컴퓨터 랜덤 숫자=" + (num[1])); 
		
		while(true) {
			while(true) {
				System.out.print("두 자리의 숫자를 입력하시오. : "); // 초기값
				
				num[0] = scan.nextInt(); // 사용자 배열값
				num[1] = answer; // 컴퓨터 배열값
				
				if(num[0] > 9 && num[0] < 100) {
					if(num[0] != num[1]) {
						break;
					}
					else if(num[0] < 10 || num[0] > 99) {
						System.out.println("다시 입력하시오.");
					}
				}
			}
			
			if(num[0] < num[1]) {
				System.out.println(num[0] + " 보다 컴퓨터 랜덤숫자가 큽니다!");
			}else if(num[0] > num[1]) {
				System.out.println(num[0] + " 보다 컴퓨터 랜덤숫자가 작습니다!");
			}else {
				System.out.println("정답입니다.");
				break;
				}
		}
		
		// 선생님 코드	//1
		int[] num = new int[2];
		Random zen = new Random();
		
		while(true) {
			num[0] = zen.nextInt(9)+1; //1-9
			num[1] = zen.nextInt(10);  //0-9
			if(num[0]!=num[1]) {
				break;
			}
		}
		System.out.println("컴퓨터 랜덤 숫자=" + (num[0]*10+num[1]));
		
		//2
		int[] num2 = new int[2];
		Scanner scan = new Scanner(System.in);
		int input = 0; 
		
		while(true) 
		{
			while(true) {
				System.out.print("두 자리숫자를 입력하시오=");
				input = scan.nextInt();
				num2[0] = input / 10;
				num2[1] = input % 10;
				
				if(input>10 && input < 100)
				{					
					if(num2[0]!=num2[1]) {
						break;
					}else {
						System.out.println("다시 입력하시오");
					}
				}else {
					System.out.println("다시 입력하시오");
				}
			}
			//System.out.println(input);
			
			//3
			if(num[0]*10+num[1] > input) {
				System.out.println(input + " 보다 컴퓨터 랜덤숫자가 큽니다!");
			}else if(num[0]*10+num[1] <input) {
				System.out.println(input + " 보다 컴퓨터 랜덤숫자가 작습니다!");
			}else {
				System.out.println("정답 맞습니다");
				break;
			}
		}
	}
}
