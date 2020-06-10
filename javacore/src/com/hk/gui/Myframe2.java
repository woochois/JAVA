package com.hk.gui;

import java.awt.*;

import javax.swing.*;

// JFrame을 이용해서 윈도우 구현 -> 상속
public class Myframe2 extends JFrame{
	
	JButton btn = new JButton("테스트");
	JButton btn2 = new JButton("테스트2");
	JButton btn3 = new JButton("테스트2");
	JButton btn4 = new JButton("테스트2");
	JButton btn5 = new JButton("테스트2");
	JButton btn6 = new JButton("테스트3");
	
	Myframe2() { // JFrame의 메소드 호출
		setTitle("타이틀제목");
		setSize(300, 300);
	}
	
	public void createwindows() {
		Container con = getContentPane(); // Component들을 직접 JFrame에 부착 불가하므로 getContentPane를 이용한다.
		BorderLayout mgr = new BorderLayout();
		con.setLayout(mgr); // con 컨테이너의 레이아웃을 변경해주는 함수
		con.add(btn, BorderLayout.CENTER);
		con.add(btn2, BorderLayout.EAST);
		con.add(btn3, BorderLayout.WEST);
		con.add(btn4, BorderLayout.SOUTH);
		con.add(btn5, BorderLayout.NORTH);
		con.add(btn6); // BorderLayout의 기본값은 CENTER - 기존에 있던 데이터를 덮어씌운다.
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 JFrame을 끝내준다.
	}
	
	public static void main(String[] args) {
		Myframe2 myfm = new Myframe2(); // 생성자 함수 호출
		myfm.createwindows();
		
	}
}
