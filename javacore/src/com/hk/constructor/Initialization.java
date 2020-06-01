package com.hk.constructor;

public class Initialization {
		static {
			// 클래스 초기화 블럭
		}
		
		{
			// 인스턴스 초기화 블럭
		}
//---------------------------------------------------------------------
		static int[] arr = new int[10]; // 명시적 초기화
		
		static { // 배열 arr을 1 ~ 10 사이의 값으로 채운다.
			for(int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 10) + 1;
			}
		}
//---------------------------------------------------------------------	
		static int cv = 1; // 명시적 초기화
		int iv = 1; // 명시적 초기화
		
		static {
			cv = 2; // 클래스  초기화 블럭
		}
		{
			iv = 2; // 인스턴스 초기화 블럭
		}
		
		Initialization(){ // 생성자
			iv = 3;
		}
//---------------------------------------------------------------------		

		static int count = 0; // 생선된 인스턴스의 수를 저장하기 위한 변수
		int serialNo; // 인스턴스 고유의 번호
		
		{ // 인스턴스 초기화 블럭 : 모든 생성자에서 공통적으로 수행될 코드
			++count;
			serialNo = count;
		}	
	}


class ProductTest {
	public static void main(String[] args) {
		Initialization p1 = new Initialization();
		Initialization p2 = new Initialization();
		Initialization p3 = new Initialization();
		
		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p2의 제품번호는 " + p2.serialNo);
		System.out.println("p3의 제품번호는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Initialization.count + "개 입니다.");
		
	}
}