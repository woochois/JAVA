package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class GridLayout_ {
	JFrame frame = new JFrame("grid");
	JButton btn = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton[] btns = new JButton[4];
	
	public GridLayout_() {
		// TODO Auto-generated constructor stub
		for(int i = 0; i < 4; i++) {
			btns[i] = new JButton((i+1)+"");
		}
	}
	
	public void createWindow() {
		frame.setTitle("그리드레이아웃");
		frame.setSize(400,400);
		
		GridLayout manager = new GridLayout(2,2);
		frame.setLayout(manager);
		
		for(int i = 0; i < 4; i++) {
			frame.add(btns[i]);
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GridLayout_ gridwin = new GridLayout_();
		gridwin.createWindow();
	}
	
}
