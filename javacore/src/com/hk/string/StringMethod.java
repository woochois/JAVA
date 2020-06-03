package com.hk.string;

public class StringMethod {
	public static void main(String[] args) {
		String name = "Smith"; // |S|m|i|t|h| 0 1 2 3 4|
		char guess = name.charAt(0);
		System.out.println("무슨 문자 ? " + guess);


		String test = name.substring(0, 2); // 시작 , 끝 - 1 : 자바는 0부터 
		System.out.println("추출 문자 ? " + test);
		test = name.substring(1, 3);
		System.out.println("추출 문자 ? " + test); // 시작 , 끝 - 1 : 자바는 0부터 
		
		String text = "Today Star Coffee Travle";
		String[] result = text.split(" ");
		System.out.println(result[0]+","+result[1]);
		// String text = "1111|kim|student|23";
	}
}
