package com.hk.function;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("두 수를 계산하는 계산기 프로그램");
		
		// 실수값을 키보드로 입력
		System.out.print("첫 번째 수를 입력하시오 : ");
		double first = reader.nextDouble();
		System.out.print("두 번째 수를 입력하시오 : ");
		double second = reader.nextDouble();
		
		System.out.print("연산자를 선택하시오 : ");
		char operator = reader.next().charAt(0);
		
		double result = 0.0d;
		
		
	// 클래스 사용
		switch(operator) {
		case	'+':
			result = Operate.plus(first,second);
			break;
		case	'-':
			result = Operate.minus(first,second);
			break;
		case	'*':
			result = Operate.multiply(first,second);
			break;
		case	'/':
			result = Operate.divide(first,second);
			break;
		case	'&': // 연산자 & 추가
			result = Operate.power(first, second);
			break;
		// 연산자가 맞지 않는 경우 (+, =, *, /, &)
		default:
			System.out.printf("오류 : 연산자가 잘못되었습니다.");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
		
/*		
 	//  기본 변수, 반복문, 조건문 사용
		switch(operator) {
		case	'+':
			result = first + second;
			break;
		case	'-':
			result = first - second;
			break;
		case	'*':
			result = first * second;
			break;
		case	'/':
			result = first / second;
			break;
		// 연산자가 맞지 않는 경우 (+, =, *, /)
		default:
			System.out.printf("오류 : 연산자가 잘못되었습니다.");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
*/	
		// 줄 띄기
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	
		
	// 함수 이용 출력
//		System.out.println(Calc(first, operator, second));
		
		
	// 연산자별 함수 따로 만들어서 출력
/*		switch(operator) {
		case	'+':
			result = plus(first,second);
			break;
		case	'-':
			result = minus(first,second);
			break;
		case	'*':
			result = multiply(first,second);
			break;
		case	'/':
			result = divide(first,second);
			break;
		case	'&': // 연산자 & 추가
			result = power(first, second);
			break;
		// 연산자가 맞지 않는 경우 (+, =, *, /, &)
		default:
			System.out.printf("오류 : 연산자가 잘못되었습니다.");
			return;
		}
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
*/	}

	// 통합 함수 이용
/*	private static double Calc(double first, char operator, double second) {

		double result = 0.0d;
		
		switch(operator) {
		case	'+':
			result = first + second;
			break;
		case	'-':
			result = first - second;
			break;
		case	'*':
			result = first * second;
			break;
		case	'/':
			result = first / second;
			break;
		// 연산자가 맞지 않는 경우 (+, =, *, /)
		default:
			System.out.printf("오류 : 연산자가 잘못되었습니다.");
			return operator;
		}
		return result;
	}
*/	
	// 연산자 하나씩 다른 함수로
	// + 함수
/*	private static double plus(double f, double s) {
		double result = f + s;
		return result;
	}
	// - 함수
	private static double minus(double f, double s) {
		double result = f - s;
		return result;
	}
	// * 함수
	private static double multiply(double f, double s) {
		double result = f * s;
		return result;
	}
	// / 함수
	private static double divide(double f, double s) {
		double result = f / s;
		return result;
	}
	// & 함수
	private static double power(double f, double s) {
		double result = 0;
		for(int i = 1; i < (int)s; i++) {
			result = f *= f;
		}
		return result;
	}
	
*/
}
