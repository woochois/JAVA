package com.hk.collection;

import java.util.*;

public class LinkListEx {
	public static void main(String[] args) {
		// 선언
		LinkedList lil = new LinkedList();
		
		// 초기 데이터 입력
		lil.add("농구화");
		lil.add("슬리퍼");
		lil.add("배낭");
		lil.add("점퍼");
		lil.add("밴드");
		
		// 데이터 추가
		lil.addFirst("탁구채");
		printList(lil);
		
		// 데이터 삭제하기
		lil.remove(3);
		printList(lil);
		
		// 마지막 데이터 삭제
		lil.removeLast();
		printList(lil);
		
		// 농구화와 슬리퍼 사이 모자 데이터 삽입
		lil.add(2, "모자");
		printList(lil);
		
		// 맨 처음 데이터를 삭제
		lil.removeFirst();
		printList(lil);
		
		
		
	}
	public static void printList(LinkedList lil) {
		for(int i = 0; i < lil.size(); i++) {
			System.out.print(lil.get(i) + ", ");
		}
		System.out.println(); // 줄 나눔
	}
}
