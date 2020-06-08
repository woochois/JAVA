package com.hk.gui;

import javax.swing.JFrame;

public class MyApp { // 단독적인 객체 생성 ( 확장성과 융통성이 없다. )
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("첫 번째 프레임");
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
