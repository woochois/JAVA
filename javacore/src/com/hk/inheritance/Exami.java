package com.hk.inheritance;

public class Exami extends Learner{
	
	// Exami() {} 기본 생성자
	
	@Override 
	String calculate(){
		String grade;
		if(score >= 80) grade = "Pass";
		else grade = "Fail";
		return grade;
	}
	void test() {
		super.calculate();
	}
}
