package exam5;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		1. 1부터 100까지의 모든 짝수들의 합을 계산하는 자바 프로그램 코드를 작성하되 for문을 사용하시오.
			
			int sum = 0;
			
			for(int i = 0; i < 101; i++) {
				if(i%2==0) {
					sum += i;
				}
			}System.out.println("1부터 100까지의 합 : " + sum);

// 		[선생님 코드]		

			int sum2 = 0; //result // 2 2 6 6
		      //   int sum2 = 0;
		         int x = 1; // -> 100
		         for (int i=0; i<100; i++) { // 2 3 4 5
		            if(x%2==0) {
		               sum2 = sum2 + x;
		            }  else {
		            //   sum2 = sum2 + x;
		            }
		            x++;
		         }
		         System.out.println(sum2);
		      //   System.out.println(sum2);
			
// 		[응용 연습 문제]
// 		1 ~ 100
//		짝수 또는 (||) 3의 배수를 합해보시오.
		    
		    int sum3 = 0;
		    
			for(int i = 0; i < 101; i ++) {
				if(i % 2 == 0 || i % 3 == 0) {					
						sum3 += i;					
				}
			}System.out.println("1부터 100까지의 짝수 또는 3의 배수의 합은 : " + sum3);
		
//		2.사용자로부터 10개의 정수를 입력 받아 최대값을 구하는 자바프로그램을 작성하시오.
			
			int res = 0;
			int max = 0;
			
			for(int i = 1; i < 11; i++) {
				System.out.print(i + "번째 숫자를 입력하시오. : ");
				res = scan.nextInt();
			
				if(res > max) {
					max = res;
				}
			} System.out.println("입력하신 정수 중 최대 값은 : " + max);
			
//		3. 택시 운전사가 10명의 손님을 태우면 그날 영업을 중단하고 집에 가서 쉰다고 하자.
//		    이 경우, 그 날의 수입을 계산하여 출력하는 프로그램을 작성하시오.
//		    각 손님이 낸 요금을 읽어들인다. 수입은 10명의 손님들이 낸 요금의 합이다.
//		    구현 방법을 설명하고 자바 프로그램을 작성하시오.
		   
			int total = 0;
			int pay = 0;
			
			for(int i = 1; i < 11; i++) {
				System.out.print(i + "번째 손님이 낸 금액 : ");
				pay = scan.nextInt();
				total += pay;
			} System.out.println("오늘 번 총 금액 : " + total +"원");
			
//			[선생님 코드]
			
				int guest = 0;
				final int MAX = 10;
				int total2 = 0;
				int fare = 0;
				
				System.out.println("-- 오늘 택시 영업 시작");
				for(int i = 0; i < MAX; i++) {
					System.out.print("요금을 입력하시오. : ");
					fare = scan.nextInt();
					total2 = total2 + fare;
					guest++;
				}
				System.out.println("오늘 태운 손님 수 : " + guest);
				System.out.println("오늘 수입 : " + total2);
				System.out.println("-- 오늘 택시 영업 끝");
			
			
//		4. 다음과 같이 구구단을 출력하는 프로그램을 작성하시오.
//			(단을 입력하면 입력한 단만 출력하도록)
			
				
			System.out.print("구구단 숫자를 입력하시오. : ");
			int input = scan.nextInt();
			
			for(int i = input; i <= input; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
			}
	

			
	}

}
