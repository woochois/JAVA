package com.hk.gui;

import java.awt.*;
import java.awt.event.*; // 이벤트 패키지

import javax.swing.*;

public class ActionPerform extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnprt = new JButton("프린트출력");
	JButton btncc = new JButton("프린트취소");
	JLabel txt = new JLabel("상태 : ");
	JPanel pan = new JPanel();
	
	// 생성자
	ActionPerform(){
		setTitle("스윙컨트롤-액션퍼포먼스"); // JFrame의 메소드
		setSize(300, 300);
		pan.add(btnprt);
		pan.add(btncc);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		con.add(txt);
		con.add(pan, BorderLayout.SOUTH);
		
		btnprt.addActionListener(this);
		btncc.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ActionPerform control = new ActionPerform();
		control.createwindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트버튼 클릭 - 리스너
		if(e.getSource().equals(btnprt)) {
		JOptionPane.showMessageDialog(this, "출력중입니다.");
		} else JOptionPane.showMessageDialog(this, "출력 취소.");
	}
}

