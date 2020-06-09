package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class Calculator__ extends JFrame {

	String cal[] = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "0", ".", "=", "/" };

	public Calculator__() {

		setLayout(new BorderLayout());

		JPanel pan1 = new JPanel(new BorderLayout());

		JTextField txt = new JTextField();
		txt.setHorizontalAlignment(JTextField.RIGHT); // 오른쪽 정렬

		pan1.add(txt, BorderLayout.CENTER);

		JPanel pan2 = new JPanel(new GridLayout(4, 4, 5, 5));

		JButton btn[] = new JButton[cal.length]; 

		for (int i = 0; i < cal.length; i++) {
			btn[i] = new JButton(cal[i]);
			pan2.add(btn[i]);
		}

		add(pan1, BorderLayout.NORTH);
		add(pan2, BorderLayout.CENTER);

		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Calculator__ start = new Calculator__();
	}
}