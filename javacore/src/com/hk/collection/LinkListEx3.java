package com.hk.collection;

import java.util.*;

public class LinkListEx3 {
	
	public static void main(String[] args) {
		// 카테고리 값을 저장해서
		LinkedList lil = new LinkedList();
		lil.add("의류");
		lil.add("스포츠");
		lil.add("가전");
		lil.add("가구");
		lil.add("컴퓨터");
		
		// 반복자로 출력해보시오
		Iterator itr = lil.iterator();
		String test = "";
		while(itr.hasNext()) {
			test += itr.next() + " ";
		}System.out.println(test);
	}

}
