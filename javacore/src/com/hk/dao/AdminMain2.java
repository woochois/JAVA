package com.hk.dao;

import java.util.Scanner;

public class AdminMain2 {
	public static void main(String[] args) {
		// 아이디를 입력받아서
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 아이디를 입력하시오.");
		String id = scan.next();

		// 해당 아이디의 정보를 출력해보자
		WorkerDao worker = new WorkerDao();
		WorkerVo result = new WorkerVo();
		result = worker.getWorkerById(id);
		System.out.println("입력한아이디 : " +result.getId());
	}


}
