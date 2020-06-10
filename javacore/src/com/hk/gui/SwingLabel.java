package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class SwingLabel extends JFrame{
	// 생성자
	SwingLabel(){
		setTitle("스윙컨트롤-레이블"); // JFrame의 메소드
		setSize(300, 300);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwingLabel control = new SwingLabel();
		control.createwindow();
	}
}

