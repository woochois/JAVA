package com.hk.elect;

public class TV { // 전체 프로그램의 한 부분 (모듈)
		
		// 1. 상태 (변수)
		// 전원
		boolean power; // 전원 true, false
		// 색깔
		String color;
		// 볼륨
		int volume;
		// 크기
		float size;
		// 채널
		int channel;
		
		// 2. 행동
		// 전원 켜고 끄기
		void powerON() { power = !power; }
		void powerOFF() { power = power; }
		// 볼륨 올리고 내리기
		void volumeUP() { volume++; }
		void volumeDOWN() { volume--; }
		// 채널 바꾸기
		void channelCHANGE(int c) { channel = c; }
		
}
