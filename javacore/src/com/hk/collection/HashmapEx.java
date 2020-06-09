package com.hk.collection;

import java.util.*;

public class HashmapEx {
	public static void main(String[] args) {
		
		// 선언
		HashMap map = new HashMap();
		
		// category - 키값(내용값)
		map.put(10, "의류");
		map.put(20, "스포츠");
		map.put(30, "가전");
		map.put(40, "가구"); // key 값이 중복되면 기존에 있던 데이터에 덮어씌워진다. (기존 데이터 삭제)
		map.put(50,"가구"); // 데이터값은 중복 가능
		
		for(int i = 1; i < 6; i++) {
			System.out.println(map.get(10 * i));
		}
	}
}
