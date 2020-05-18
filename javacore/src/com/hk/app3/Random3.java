package com.hk.app3;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		// 임의의 숫자 (음수 ~ 양수)
		// 조건물을 사용하여 짝수, 홀수 판별 출력
		Random ran = new Random();
		int rs = ran.nextInt();
		String res = "";
		if(rs%2==0) res="짝수";
		else if(rs%2==1) res="홀수";
		System.out.println(rs + " 은 " + res);
		
		String result = "";
		double mat = Math.random();
		if(mat%2==0) result="짝수";
		else if(mat%2==1) result="홀수";
		System.out.println(mat + "은 " + result);
		

	}

}
