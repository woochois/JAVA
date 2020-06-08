package com.hk.gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exam extends JFrame{
	
	public Exam() {
		setTitle("배우지 않은 것을 해보라니..");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2));

		Container con = getContentPane();
		
		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("취소");
		JButton b3 = new JButton("회원가입");

		
		con.add(new JLabel("id"));
		con.add(new JTextField(""));
		con.add(new JLabel("pw"));
		con.add(new JTextField(""));
				
		con.add(b1);
		con.add(b2);
		con.add(b3);
				
		setSize(200,200);
		setVisible(true);
	} 
	
	public static void main(String[] args) {
		new Exam();
	}
}
