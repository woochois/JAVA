package com.hk.function;

public class GraphRandom {
	public static String printGraph(char ch, int value) {
		String result = "";
		for(int i = 0; i < value; i++) {
			result += ch; // 입력한 문자를 입력한 수 만큼 출력
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] number = new int[100]; // 임의의 수 100개 발생
		int[] counter = new int[10]; // 카운트
		// counter[0] = 12
		
		// 숫자 100개 발생 23450569...
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
			// ex) 0.99899 -> 9.9899 -> 9
		}
		System.out.println(); // 줄 띄기

		// 0 ~ 9 가 몇 번 씩 나왔는 지 
		for(int i = 0; i < number.length; i++) {
			counter[number[i]]++; 
			// ex) count[2] =++;
		}
		
		// 화면에 그래프 출력
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 : " + printGraph('■', counter[i]) + " " + counter[i]);
		}
	}
}
