package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class SwingLabel2 extends JFrame{
	
	JLabel txt = new JLabel("타이틀제목 : 라벨");
	JLabel txt2 = new JLabel("", JLabel.CENTER);
	
	// 333 x 499
	ImageIcon img = new ImageIcon("images/rabbit.jpg");
	JLabel txt3 = new JLabel(img);
	
	// 생성자
	SwingLabel2(){
		setTitle("스윙컨트롤-라벨"); // JFrame의 메소드
		setSize(400, 600);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(txt, BorderLayout.NORTH);
		String temp = txt.getText(); // 텍스트를 가져오는 함수
		txt2.setText(temp); // 텍스트를 변경하는 함수
		txt2.setText("중앙컨텐츠입니다.");
		txt2.setForeground(Color.BLUE);
		txt2.setOpaque(true);
		txt2.setBackground(Color.CYAN);
		con.add(txt3, BorderLayout.CENTER);
		con.add(txt2, BorderLayout.SOUTH);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		SwingLabel2 control = new SwingLabel2();
		control.createwindow();
	}
}

