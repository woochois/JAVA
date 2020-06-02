package com.kr.inheritance;

import java.util.Scanner;

public class Learner {
	
	// Learner() {} 기본 생성자
	
	Scanner scan = new Scanner(System.in);
	int score = scan.nextInt();
	String calculate(){
		String grade;
		if(score >= 60) grade = "Pass";
		else grade = "Fail";
		return grade;
	}
	public static void main(String[] args) {
		Learner learn = new Learner();
		System.out.println(learn.calculate());
	}
}
