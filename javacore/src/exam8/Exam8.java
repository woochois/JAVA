package exam8;

public class Exam8 {

	public static void main(String[] args) {

	
/*
		1. 중첩 for문을 사용하여 다음과 같이 출력하시오
		Semo1
		 		*
		 	  * *
		 	* * *
		  * * * *
		* * * * *
		2. semo2
		*
		* *
		* * *
		* * * *
		* * * * *
*/
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}System.out.println();
		}System.out.println();
		
				
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}System.out.println();
		}System.out.println();
		
/*
		3. 중첩 for문을 사용하여 다음과 같이 출력하시오
		Semo3
		* * * * *
		* * * *
		* * *
		* *
		*
		4. Semo
		* * * * *
		  * * * *
		    * * *
		      * *
		      	*
*/
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("* ");	
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = 4; j >= i; j--) {
				System.out.print("* ");
			}System.out.println();
		}System.out.println();
/* 
 * 		번외 . 다이아몬드 찍기
 */
		do {
			for(int i = 0; i < 4; i++) {
				for(int j = 3; j >= i; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j < i + 1; j++) {
					System.out.print("* ");
				}System.out.println();
			}
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = 4; j >= i; j--) {
					System.out.print("* ");
				}System.out.println();
			}System.out.println();
		}while(false);
		
/*
		5. 다음 중 클래스가 아니고 객체라고 볼 수 있는 것은 무엇인가?
				구분하고 이유를 설명하라
				 책 Book
				 자바 프로그래밍 이라는 책 java
				 내가 가지고 있는 유일한 자바 프로그래밍 이라는 책 mybk
				 내 강아지 mydog
				 강아지 Dog
				 우편배달부를 몰고 있는 내 강아지 postdog
				 자동차 Vehicle
				 소나타 자동차 sonata
				 시계 Watch
				 오메가 시계 omega

		Book : 클래스 - 연관되어 있는 변수와 메서드의 집합
		*java : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
		*mybk : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
		
		*mydog : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
		dog : 클래스 - 연관되어 있는 변수와 메서드의 집합
		*postdog : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
		
		Vehicle : 클래스 - 연관되어 있는 변수와 메서드의 집합
		*sonata : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
		
		Watch : 클래스 - 연관되어 있는 변수와 메서드의 집합
		*omega : 객체 - 클래스에 선언된 모양 그대로 생성된 실체
*/
		
		
		
	}

}
