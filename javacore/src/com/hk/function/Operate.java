package com.hk.function;

public class Operate {
	
	// 상태(속성)변수
	// 인스턴스 변수
	int sum;
	int count;
	int avg;
	
	// 클래스 변수
	static int max;
	static int min;
	
	// + 함수
	public static double plus(double f, double s) {
		double result = f + s; 	// 지역 변수
		return result;
	}
	// - 함수
	public static double minus(double f, double s) {
		double result = f - s;	// 지역 변수
		return result;
	}
	// * 함수
	public static double multiply(double f, double s) {
		double result = f * s;	// 지역 변수
		return result;
	}
	// / 함수
	public static double divide(double f, double s) {
		double result = f / s;	// 지역 변수
		return result;
	}
	// & 함수
	public static double power(double f, double s) {
		double result = 0;	// 지역 변수
		for(int i = 1; i < (int)s; i++) {
			result = f *= f;
		}
		return result;
	}
}
