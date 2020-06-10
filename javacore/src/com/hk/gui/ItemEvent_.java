package com.hk.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ItemEvent_ extends JFrame implements ItemListener{
	
	// 체크박스
	JCheckBox chk1 = new JCheckBox("스파게티-12,000원");
	JCheckBox chk2 = new JCheckBox("파스타-15,000원");
	JPanel pan = new JPanel();
	int sum = 0;

	// 생성자
	ItemEvent_(){
		setTitle("스윙컨트롤-레이블"); // JFrame의 메소드
		setSize(300, 300);
		pan.add(chk1);
		pan.add(chk2);
	}
	public void createwindow() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add(pan, BorderLayout.NORTH);

		// 1번		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		ItemEvent_ control = new ItemEvent_();
		control.createwindow();
	}

	@Override
	public void itemStateChanged(java.awt.event.ItemEvent e) {
//		JOptionPane.showMessageDialog(null, "테스트");
		if (e.getSource().equals(chk1) && e.getStateChange() == ItemEvent.SELECTED) {
			sum += 12000;
			JOptionPane.showMessageDialog(null, "합계는 : " + sum);
		}else if(e.getSource().equals(chk2) && e.getStateChange() == ItemEvent.SELECTED) {
			sum += 15000;
			JOptionPane.showMessageDialog(null, "합계는 : " + sum);
		}
	}
}
