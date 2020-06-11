package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class MouseEvent_2 extends JFrame{

	// 텍스트
	JTextField txt = new JTextField();
	
	// 생성자
	MouseEvent_2(){
		setTitle("스윙컨트롤-마우스이벤트"); // JFrame의 메소드
		setSize(300, 300);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		MouseMyEvent mybtn = new MouseMyEvent();
		mybtn.btn = new JButton("마우스 이벤트 처리");
	
		con.add(mybtn.btn, BorderLayout.NORTH);
		con.add(txt, BorderLayout.SOUTH);
		
		mybtn.btn.addMouseListener(mybtn);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MouseEvent_2 control = new MouseEvent_2();
		control.createwindow();
	}
}

