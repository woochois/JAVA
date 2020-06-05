package exam6;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) throws Exception{
		
		// 작성 위치
		int sum = 0; // 합
		for(int i = 1; i < 101; i++) { // 반복
			if(i % 3 == 0) sum += i; // i 가 3의 배수면 계속 더해라
		}System.out.println(sum); // 출력
		
		// 작성 위치
		boolean r = true; // 실행
	
		while(r) { // 반복
			int i = (int)(Math.random() * 6) + 1; // 눈 1
			int j = (int)(Math.random() * 6) + 1; // 눈 2
			if(i + j == 5) r = false; // 눈의 합이 5가 되면 종료
			else System.out.println("(" + i + ", " + j + ")"); // 출력 
		}
		
		// 작성 위치
		for(int x = 1; x < 11; x++) {
			for(int y = 1; y < 11; y++) {
				if(4*x + 5*y == 60) System.out.println("(" + x + ", " + y + ")");
			}
		}
		
		// 작성 위치
		for(int n = 0; n < 5; n++) {
			System.out.println(" ");
			for(int m = 0; m < n+1; m++) {
				System.out.print("*");
			}
		}
		
		System.out.println(" "); // 간격
		
		// 작성 위치
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		int keyCode = 0; // 입력 받을 값
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
				System.out.println("--------------------------------");
				System.out.print("선택> ");
			}
			
			// 작성 위치
			keyCode = System.in.read(); // 키보드 값 입력
			
			if(keyCode == 49) { // 1. 예금을 읽었을 경우
				System.out.print("예금액> ");
				balance += scan.nextInt();
				System.out.println(" ");
			}else if(keyCode == 50) { // 2. 출금을 읽었을 경우
				System.out.print("출금액> ");
				balance -= scan.nextInt();
				System.out.println(" ");
			}else if(keyCode == 51) { // 3. 잔고를 읽었을 경우
				System.out.print("잔고> " + balance);
				System.out.println(" ");
			}else if(keyCode == 52) { // 4. 종료를 읽었을 경우
				run = false;
				System.out.println(" ");
			}
		}
		System.out.println("프로그램 종료");
	}
}
