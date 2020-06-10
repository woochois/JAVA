package com.hk.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class EventListener extends JFrame implements ActionListener{
	
	JButton btnch = new JButton("Eagle");

	// 생성자
	EventListener(){
		setTitle("스윙컨트롤-Action 이벤트 리스너 작성"); // JFrame의 메소드
		setSize(300, 300);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(btnch, BorderLayout.NORTH);
		btnch.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		EventListener control = new EventListener();
		control.createwindow();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "확인"); // 메세지 출력
		JButton temp = (JButton)e.getSource();
		if(temp.getText().equals("Eagle")) temp.setText("독수리");
		else temp.setText("Eagle");
		
	}
}

