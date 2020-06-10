package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class SwingCheck extends JFrame{
	
	// 패널
	JPanel pan = new JPanel();
	
	// 체크박스 -> 패널에 올려서 프레임에 올리기
	JCheckBox ch1 = new JCheckBox("피자");
	JCheckBox ch2 = new JCheckBox("빈대떡", true); // 체크
	JCheckBox ch3 = new JCheckBox("파전");
	
	// 임시버튼
	JButton btn = new JButton();
	
	// 생성자
	SwingCheck(){
		setTitle("스윙컨트롤-체크박스"); // JFrame의 메소드
		setSize(300, 300);
		ch1.setSelected(true); // 체크
		ch2.setSelected(false); // 체크 해제
		pan.add(ch1);
		pan.add(ch2);
		pan.add(ch3);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(pan, BorderLayout.NORTH);
		con.add(btn);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwingCheck control = new SwingCheck();
		control.createwindow();
	}
}

