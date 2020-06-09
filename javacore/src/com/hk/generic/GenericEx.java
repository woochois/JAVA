package com.hk.generic;

import java.util.*;

public class GenericEx {
	public static void main(String[] args) {
		ArrayList<String> arrbox = new ArrayList<String>(); // String으로 지정
		arrbox.add("라일락 꽃 향기 맡으며");
		arrbox.add("장미 꽃 향기 맡으며");
		arrbox.add("오렌지 꽃 향기 맡으며");
		
		ArrayList arrbox2 = new ArrayList(); // 형이 지정되지 않으니 Object값
		arrbox.add("라일락 꽃 향기 맡으며");
		arrbox.add("장미 꽃 향기 맡으며");
		arrbox.add("오렌지 꽃 향기 맡으며");
		
		// 가져올 때
		String sports = arrbox.get(0); // String값 반환
		String sports2 = (String)arrbox2.get(0); // Object값 반환
		
		
	}
}
