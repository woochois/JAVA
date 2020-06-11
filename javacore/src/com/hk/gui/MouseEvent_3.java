package com.hk.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseEvent_3 extends JFrame{
	
	JButton btntitle = new JButton("마우스 이벤트 확인");
	JTextField text = new JTextField();
	
	
	
	// 생성자
	MouseEvent_3(){
		setTitle("스윙컨트롤-마우스이벤트"); // JFrame의 메소드
		setSize(300, 300);
	}
	
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(btntitle, BorderLayout.NORTH);
		con.add(text, BorderLayout.SOUTH);
		
		// 객체에 바로 붙여서 사용
		this.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				String result = "(" + x + "," + y + ")"; // (x,y)
				text.setText(result);
			}
		});
		
		this.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e) {
				text.setText("마우스가 안으로 들어옴!");
			}
		});
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MouseEvent_3 control = new MouseEvent_3();
		control.createwindow();
	}
}

