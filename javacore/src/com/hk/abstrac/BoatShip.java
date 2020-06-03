package com.hk.abstrac;

public class BoatShip extends Character{

	// move 재정의를 하시오
	// x*50
	// y*50
	@Override
	void move(int x, int y, int z) {
		this.x=x*50;
		this.y=y*50;
		this.z=0;
	}
}
