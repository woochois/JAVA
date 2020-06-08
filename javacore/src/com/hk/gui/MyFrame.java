package com.hk.gui;

import java.awt.Container; // swing의 부모클래스
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame; // 독립적

public class MyFrame extends JFrame{ // JFrame으로 윈도우창을 생성 (이 방법 추천)
	public MyFrame() {
		setTitle("첫 번째 프레임");
		setSize(384, 216);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		Container myCont = mf.getContentPane();
		
		// 레이아웃변경
		FlowLayout mgr = new FlowLayout(); // 직선형태의 배치
		myCont.setLayout(mgr);
		
		JButton jb = new JButton("눌러"); // 버튼 생성
		myCont.add(jb); // 컨텐트팬에 버튼 jb 부착
		JButton jb2 = new JButton("눌러라"); // 버튼 생성
		myCont.add(jb2); // 컨텐트팬에 버튼 jb 부착
		mf.setVisible(true); // 그려주는 함수
	}
	
	public static void close() {
		MyFrame mf = new MyFrame();
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 화면 + 프로세스 멈춤
	}
}
