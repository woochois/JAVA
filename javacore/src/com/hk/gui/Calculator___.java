package com.hk.gui;

import java.awt.*;

import javax.swing.*;

// 계산기를 만들어보자 (강사 소스)
public class Calculator___ extends JFrame { // JFrame 상속
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		// 생성자 초기화
		Calculator___(){
			setTitle("계산기예제");
			setSize(220, 250);
		}
	// 버튼을 생성
		JButton btn1 = new JButton("7");
		JButton btn2 = new JButton("8");
		JButton btn3 = new JButton("9");
		JButton btn4 = new JButton("/");
		JButton btn5 = new JButton("4");
		JButton btn6 = new JButton("5");
		JButton btn7 = new JButton("6");
		JButton btn8 = new JButton("*");
		JButton btn9 = new JButton("1");
		JButton btn10 = new JButton("2");
		JButton btn11 = new JButton("3");
		JButton btn12 = new JButton("-");
		JButton btn13 = new JButton("C");
		JButton btn14 = new JButton("0");
		JButton btn15 = new JButton("=");
		JButton btn16 = new JButton("+");

	// 패널 생성
	JPanel pan = new JPanel();
	
	// 텍스트 상자 생성
	JTextField txt = new JTextField();
	
	// 윈도우 그리는 함수
		public void createawindow() {
			Container fmcont = getContentPane();
			pan.setLayout(new FlowLayout());
			pan.add(btn1);
			pan.add(btn2);
			pan.add(btn3);
			pan.add(btn4);
			pan.add(btn5);
			pan.add(btn6);
			pan.add(btn7);
			pan.add(btn8);
			pan.add(btn9);
			pan.add(btn10);
			pan.add(btn11);
			pan.add(btn12);
			pan.add(btn13);
			pan.add(btn14);
			pan.add(btn15);
			pan.add(btn16);
			
			fmcont.setLayout(new BorderLayout());
			fmcont.add(txt, BorderLayout.NORTH);
			fmcont.add(pan, BorderLayout.CENTER);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			Calculator___ cals = new Calculator___();
			cals.createawindow();
		}

}
