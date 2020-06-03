package com.hk.abstrac;

public class House extends Character{

	String color;
	
	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	@Override
	void move(int x, int y, int z) {
		
		
	}
	
}
