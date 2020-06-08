package com.hk.gui;

import java.awt.*; // swing 부모클래스
import javax.swing.*;

// JFrame Container를 먼저 구현
public class FlowLayout_ extends JFrame{ // JFrame 상속
	
	FlowLayout_(){ // 초기화
		// 프레임 초기값
		setTitle("라일락 꽃 향기 맡으며...");
		setSize(500,500);
		setLayout(new FlowLayout((FlowLayout.CENTER), 50, 50)); // 기본 (Border) --> 직선형태 배치
	}
	
	public static void main(String[] args) {
		FlowLayout_ fl = new FlowLayout_();
		
		Container cont = fl.getContentPane(); // 회색영역에 배치
		JButton jb1 = new JButton("가일락");
		JButton jb2 = new JButton("나일락");
		JButton jb3 = new JButton("다일락");
		cont.add(jb1);
		cont.add(jb2);
		cont.add(jb3);
		fl.setVisible(true);
	}

}
