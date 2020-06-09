package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class BorderLayout__ extends JFrame{
	
	JPanel pan1 = new JPanel();
	JButton btn1 = new JButton("확인");
	JButton btn2 = new JButton("취소");
	JButton btn3 = new JButton("이미지");
	JLabel txt = new JLabel("출력할 제목은 라리온.jpg");
	
	public BorderLayout__() {
		setTitle("패널");
		setSize(500,500);
		FlowLayout mgr = new FlowLayout();
		pan1.setLayout(mgr);
		pan1.add(btn1);
		pan1.add(btn2);
	}
	public void createWindow() {		
		Container cont = getContentPane();
		BorderLayout mgr2 = new BorderLayout();
		cont.setLayout(mgr2);
		
		cont.add(btn3, BorderLayout.CENTER);
		cont.add(pan1, BorderLayout.SOUTH);
		cont.add(txt, BorderLayout.NORTH);
	
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		BorderLayout__ border_pan = new BorderLayout__();
		border_pan.createWindow();
	}
}
