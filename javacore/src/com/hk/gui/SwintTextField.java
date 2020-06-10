package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class SwintTextField extends JFrame{
	
	// 패널
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	
	// 체크박스 -> 패널에 올려서 프레임에 올리기
	JCheckBox ch1 = new JCheckBox("피자");
	JCheckBox ch2 = new JCheckBox("빈대떡", true); // 체크
	JCheckBox ch3 = new JCheckBox("파전");
	
	// 라디오버튼
	JRadioButton ra1 = new JRadioButton("회원", true);
	JRadioButton ra2 = new JRadioButton("비회원");
	ButtonGroup btngrp = new ButtonGroup();
	
	// 임시버튼
	JButton btn = new JButton("이름을 입력하시오. ");
	
	// 텍스트 입력 1줄
	JTextField text = new JTextField(10);
	
	// 생성자
	SwintTextField(){
		setTitle("스윙컨트롤-텍스트필드"); // JFrame의 메소드
		setSize(300, 300);
		ch1.setSelected(true); // 체크
		ch2.setSelected(false); // 체크 해제
		pan1.add(ch1);
		pan1.add(ch2);
		pan1.add(ch3);
		btngrp.add(ra1); // 라디오버튼 1, 라디오버튼 2 같은 그룹으로 묶음
		btngrp.add(ra2); 
		pan2.add(ra1);
		pan2.add(ra2);
		pan3.add(text);
		pan3.add(btn);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(pan1, BorderLayout.NORTH);
		con.add(pan3);
		con.add(pan2, BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwintTextField control = new SwintTextField();
		control.createwindow();
	}
}
