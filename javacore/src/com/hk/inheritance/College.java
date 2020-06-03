package com.hk.inheritance;

public class College extends Learner{
	
	int toeic;
	College(){
		super(); // 부모의 생성자를 호출 - 항상 맨 위에
		int toeic = 600;
	}
	
	@Override
	String calculate(){
		String grade = null;
		if(score >= 90) grade = "A";
		else if(score >= 80) grade = "B";
		else if(score >= 70) grade = "C";
		return grade;
	}
	
	void test() {
		super.calculate();
	}
}
