package com.hk.generic;

public class NewBoxUnit {
	public static void main(String[] args) {
		NewBox<String> str = new NewBox<String>();
		str.setData("새로운 문자열이 들어왔습니다.");
		String temp = str.getData();
		System.out.println(temp);
	}
}
