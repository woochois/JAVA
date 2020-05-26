package practice;

import java.io.IOException;

public class TestClear2 {
	public static void main(String[] args) throws InterruptedException {
		// 1 ~ 100 까지 출력
		int x = 1;
		while(true) {
			System.out.println(x++ + "초");
			Thread.sleep(1000); // 속도 조절
			clearConsole(); // 화면 지우는 함수
			if(x>100) break;
		}
	}

	public final static void clearConsole() { // 화면 지우는 함수
		try {
			// 윈도우계열 플랫폼
			if(System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			// 유닉스(맥), 리눅스(free 유닉스)
			else Runtime.getRuntime().exec("clear");
		} catch(IOException | InterruptedException ex) {} 
	}
}
