package exam4;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		
//		1. 다음  switch 문을 if 문으로 바꾸어라.
/*		
		int grade = 1;
		
		switch(grade)
		{
		case 1: System.out.println("You are a freshman"); break;
		case 2: System.out.println("You are a sophomore"); break;
		case 3: System.out.println("You are a junior"); break;
		case 4: System.out.println("You are a senior"); break;
		}
		
		if(grade == 1) {
			System.out.println("You are a freshman");
		}else if(grade == 2){
			System.out.println("You are a sophomore");
		}else if(grade == 3) {
			System.out.println("You are a junior");
		}else if(grade == 4) {
			System.out.println("You are a senior");
		}
*/
		
//		2. 정수 number를 키보드를 통해 입력을 받고 3의 배수인지 아닌지를 결정하는 순서도를 작성하라.
//			3의 배수라면 "3의 배수이다"
//			아니라면 "3의 배수가 아니다" 라고 출력하라
//			순서도를 기반으로 자바 프로그램을 작성하라
/*
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%3==0) System.out.println("3의 배수이다");
		else if(num%3==1) System.out.println("3의 배수가 아니다");
*/
		
//		3. 학생의 총 이수학점과 토익점수를 입력받아 졸업이나 수료 여부를 알려주는 프로글매의 순서도를 작성하고 자바 프로그램을 작성하라.
//			- 총 이수학점이 140점 이상이고, 토익점수가 700점 이상이면 졸업
//				"졸업을 축하합니다"
//			- 총 이수학점이 140점 이상이나, 토익점수가 700점 미만이면 수료
//				"아쉽지만 수료하셨습니다"
//			- 총 이수학점이 140점 미만이면 졸업도 안되고 수료도 안되므로
//				"졸업이 불가합니다"
/*
		Scanner scan = new Scanner(System.in);
		System.out.print("이수학점을 입력하시오. : ");
		int sc1 = scan.nextInt();
		System.out.print("토익점수를 입력하시오. : ");
		int sc2 = scan.nextInt();
		
		if(sc1>=140) {
			if(sc2>=700) {
				System.out.println("졸업을 축하합니다.");
			}else System.out.println("아쉽지만 수료하셨습니다.");
		}else System.out.println("졸업이 불가합니다.");
*/	
		
	}

}
