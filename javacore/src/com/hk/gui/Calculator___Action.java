package com.hk.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



class btnOp {
	
}

class btnClear {
	
}

class btnCal {
	
}

// 계산기를 만들어보자 (강사 소스)
public class Calculator___Action extends JFrame implements ActionListener{ // JFrame 상속
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		// 생성자 초기화
		Calculator___Action(){
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
	JTextField text = new JTextField();
	
	// 문자열 생성
	String strnumber = "";
	
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

			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			
			btn5.addActionListener(this);
			btn6.addActionListener(this);
			btn7.addActionListener(this);
			
			btn9.addActionListener(this);
			btn10.addActionListener(this);
			btn11.addActionListener(this);
			
			btn14.addActionListener(this);
			
						
			fmcont.setLayout(new BorderLayout());
			fmcont.add(text, BorderLayout.NORTH);
			fmcont.add(pan, BorderLayout.CENTER);
			
			text.setHorizontalAlignment(JTextField.RIGHT);
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			Calculator___Action cals = new Calculator___Action();
			cals.createawindow();
		}

		// ActionListener의 메소드 재정의
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btn1)) {
				strnumber = strnumber + 7;
			}else if (e.getSource().equals(btn2)) {
				strnumber = strnumber + 8;
			}else if (e.getSource().equals(btn3)) {
				strnumber = strnumber + 9;
			}else if (e.getSource().equals(btn5)) {
				strnumber = strnumber + 4;
			}else if (e.getSource().equals(btn6)) {
				strnumber = strnumber + 5;
			}else if (e.getSource().equals(btn7)) {
				strnumber = strnumber + 6;
			}else if (e.getSource().equals(btn9)) {
				strnumber = strnumber + 1;
			}else if (e.getSource().equals(btn10)) {
				strnumber = strnumber + 2;
			}else if (e.getSource().equals(btn11)) {
				strnumber = strnumber + 3;
			}else if (e.getSource().equals(btn14)) {
				strnumber = strnumber + 0;
			}
			text.setText(strnumber);
		}

}

