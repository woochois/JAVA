package com.hk.dao;

import java.util.Scanner;

public class AdminMain {
	public static void main(String[] args) {
		System.out.println("관리자프로그램");
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하시오. ");
		String id = scan.next();
	//	System.out.print("비밀번호를 입력하시오. ");
//		String pw = scan.next();
		System.out.print("수정할 핸드폰번호를 입력하시오. ");
		String phone = scan.next();
		
		WorkerDao wd = new WorkerDao();
	//	int result = wd.getTotalWorker();
	//	System.out.println("총 인원 : " + result);
	//	int login = wd.checkLogin(id, pw);
	//	if(login==1) {
	//		System.out.println("로그인 성공!");
	//	}else System.out.println("다시 로그인하시오!");	
		int update = wd.updatePhone(id, phone);
		if(update==1) System.out.println("핸드폰번호 변경 완료!");
		else System.out.println("핸드폰번호 변경 실패!");
		
	}
}
