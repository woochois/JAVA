package com.hk.gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_ extends JFrame{
	
	
	static JButton btn = new JButton("1번째 버튼");
	static JButton btn2 = new JButton("1번째 버튼");
	
	BorderLayout_(){
		setTitle("보더레이아웃");
		setSize(500,600);
		BorderLayout border = new BorderLayout();
		setLayout(border);
	}
	
	public void createWindows() {
		add(btn, BorderLayout.CENTER); // 위치값
		add(btn2, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 일반적으로 다른 클래스가 더 좋다.
	public static void main(String[] args) {
		BorderLayout_ newWin = new BorderLayout_();
		newWin.createWindows();
	}
	
}
