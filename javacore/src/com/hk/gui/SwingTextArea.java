package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class SwingTextArea extends JFrame{
	
	// 텍스트영역
	JTextArea longtext = new JTextArea("여기에 게시글을 입력하시오.", 7, 20); // ("", row, column)
	// 버튼
	JButton btn = new JButton("등록하기");
	// 텍스트필드
	JTextField text = new JTextField("제목을 입력하시오.");
	
	// 생성자
	SwingTextArea(){
		setTitle("스윙컨트롤-텍스트영역"); // JFrame의 메소드
		setSize(300, 300);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(text, BorderLayout.NORTH);
		con.add(longtext);
		con.add(btn, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwingTextArea control = new SwingTextArea();
		control.createwindow();
	}
}

