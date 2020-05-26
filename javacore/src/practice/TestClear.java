package practice;

import java.io.IOException;

public class TestClear {

	// cmd 에서 실행하려면 경로패스로 가서 bin 폴더 들어가서 java 패키지명.클래스명
	// ex) C:\coding\git\java\JOONGANGJAVATESTCODE\javacore\bin> java practice.TestClear
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		clearConsole();
		System.out.println("hello");
	}

	public final static void clearConsole() {
		try {
			// 윈도우계열 플랫폼
			if(System.getProperty("os.name").contains("Windows")) new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			// 유닉스(맥), 리눅스(free 유닉스)
			else Runtime.getRuntime().exec("clear");
		} catch(IOException | InterruptedException ex) {} 
	}

}
