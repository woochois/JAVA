package exam14;

import java.util.*;

public class Student {
	static String name; // 인스턴스 변수
	static int eng, chn; // 인스턴스 변수
	
	static ArrayList<String> list = new ArrayList<String>(); // 이름저장 
	static ArrayList<Integer> list2 = new ArrayList<Integer>(); // 영어점수 저장
	static ArrayList<Integer> list3 = new ArrayList<Integer>(); // 중국어점수 저장
	
	static void cal() { // 입력 메소드
		for (int i = 0; i < 3; i++) { // 3명 입력
			Scanner scan = new Scanner(System.in);
			System.out.print("이름을 입력하시오 : ");
			name = scan.next();
			System.out.print("영어 점수를 입력하시오 : ");
			eng = scan.nextInt();
			System.out.print("중국어 점수를 입력하시오 : ");
			chn = scan.nextInt();
			list.add(name); // 리스트1에 이름 하나씩 저장
			list2.add(eng); // 리스트2에 점수 하나씩 저장
			list3.add(chn); // 리스트3에 점수 하나씩 저장
		}
	}
	static void print() { // 출력 메소드
		for (int i = 0; i < list.size(); i++) { // 입력 받은 값만큼 반복
			int sum = list2.get(i) + list3.get(i); // 총점
			double avg = (list2.get(i) + list3.get(i)) / 2; // 평균
			System.out.println("이름 : " + list.get(i) + "\n총점 : " + sum + "\n평균 : " + avg);
		}
	}
	public static void main(String[] args) {
		cal();
		print();
	}
}
