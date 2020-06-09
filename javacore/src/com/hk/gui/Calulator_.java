package com.hk.gui;

import java.awt.*;

import javax.swing.*;

public class Calulator_ extends JFrame{
	
	JPanel pan1 = new JPanel();
	
	public Calulator_() {
		setTitle("Calculator");
		setSize(500,500);
		pan1.setLayout(new GridLayout(4,4,5,5));

		pan1.add(new JButton("7"));
		pan1.add(new JButton("8"));
		pan1.add(new JButton("9"));
		pan1.add(new JButton("/"));
		pan1.add(new JButton("4"));
		pan1.add(new JButton("5"));
		pan1.add(new JButton("6"));
		pan1.add(new JButton("*"));
		pan1.add(new JButton("1"));
		pan1.add(new JButton("2"));
		pan1.add(new JButton("3"));
		pan1.add(new JButton("-"));
		pan1.add(new JButton("C"));
		pan1.add(new JButton("0"));
		pan1.add(new JButton("="));
		pan1.add(new JButton("+"));
	}
	public void createWindow() {
		
		setLayout(new BorderLayout());
		add(new JTextField(), BorderLayout.NORTH);	
		add(pan1);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calulator_ cal = new Calulator_();
		cal.createWindow();
		
	}
	
}
