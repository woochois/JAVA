package com.hk.vo;

public class TestDTO {
	public static void main(String[] args) {
		
		// TimeVo로 표현 : 개발하려고 하면 시간이 많이 걸림
		TimeVO watch = new TimeVO();
		watch.hour = 4;
		watch.min = 30;
		watch.sec = 40;
		
		// 개별적으로 표현
		int h = 5;
		int m = 50;
		int s = 30;
	}
}
