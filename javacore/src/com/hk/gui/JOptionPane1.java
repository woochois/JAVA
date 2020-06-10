package com.hk.gui;

import java.util.*;

import javax.swing.*;

public class JOptionPane1 {
	public static void main(String[] args) {

		// 랜덤숫자 맞추기 1 ~ 10까지
		int guess = 0, target; // 찾는 랜덤값
		String guessStr, message = "";
		int again = 1; // 1이면 다시 입력하기 정의
		Random zen = new Random();
		target = zen.nextInt(10) + 1; // 1 ~ 10
		
		System.out.println("랜덤값 : " + target);
		
		do {
			// JOptionPane 값을 입력받음
			guessStr = JOptionPane.showInputDialog("추측 숫자를 입력하시오.");
			guess = Integer.valueOf(guessStr);

			// 비교처리
			if (guess > target) {
				message = "입력값이 랜덤값보다 큽니다.";
			} else if (guess < target) {
				message = "입력값이 랜덤값보다 작습니다.";
			} else {
				message = "정답입니다.";
				again = 0;
			}
			// JOptionPane 결과 출력
			JOptionPane.showMessageDialog(null, message);
		} while (again==1);
	}
}
