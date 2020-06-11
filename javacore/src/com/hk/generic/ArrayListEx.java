package com.hk.generic;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		// ArrayList 배열 안에 정수 관리 클래스
		// Score 클래스 name, kor, chn, jpn --> kimkk
		ArrayList<Score> firstban = new ArrayList<Score>();
		ArrayList firstban2 = new ArrayList(); // 제네릭  타입 없어도 상관은 없다.
		Score kim = new Score();
		firstban.add(kim);
		
	}
}
