package com.hk.interfac;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalMethod {
	public static void main(String[] args) {
		
		// 선언, 생성자로 초기화 형태
		DecimalFormat df = new DecimalFormat("#,###,###");
		
		// 금액에 대한 포멧
		// 정수 --> 문자열 포멧 변경
		int money = 1200000;
		money += 1250000;
		String result = df.format(money);
		System.out.println(result);
		
		// 문자열 포멧 --> 정수 변경
		String dbmoney = "123,567";
		try {
			Number temp = df.parse(dbmoney); // 텍스트 분석
			int num = temp.intValue();
			System.out.println(num);
		} catch (ParseException e) { 
			e.printStackTrace();
		}
		
		// 원의 넓이를 출력하시오
		
		int r = 15;
		
		// 원의 넓이 area 선언
		double area = 0;
		area = (Math.pow(r, 2) * Math.PI);
		
		// 정수.소수(2자리까지) 출력하시오
		DecimalFormat dfo = new DecimalFormat("#.##");
		System.out.println(dfo.format(area));
		
		// 이미 있는 df 포멧 패턴 변경
		df.applyPattern("#.##");
		System.out.println(df.format(area));
			
	}
}
