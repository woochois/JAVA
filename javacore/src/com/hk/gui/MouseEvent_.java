package com.hk.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseEvent_ extends JFrame implements MouseListener{
	
	// 텍스트필드
	JTextField text = new JTextField();
	
	// 라벨
	JLabel txt = new JLabel("마우스이벤트");
	
	
	
	// 생성자
	MouseEvent_(){
		setTitle("스윙컨트롤-마우스이벤트"); // JFrame의 메소드
		setSize(300, 300);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(txt, BorderLayout.NORTH);
		con.add(text, BorderLayout.SOUTH);
		
		this.addMouseListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MouseEvent_ control = new MouseEvent_();
		control.createwindow();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("마우스 클릭");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("마우스가 들어옴");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText("마우스가 나감");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

