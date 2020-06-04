package com.hk.interfac;

// 탈 것의 핸들
public interface Handle {
	
	final int MAX = 10; // 이동 최대값
	// int MAX; 불가
	
	public void moveLeft();
	public void moveRight();
	
	public void pullIn();
	public void putOut();
	
}
