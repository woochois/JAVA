package com.hk.collection;

import java.util.*;

import com.hk.vo.*;

public class LinkListEx4OBJ {
	
	public static void main(String[] args) {
		CategoryVO[] cate = new CategoryVO[4];
		String[] data = { "의류", "스포츠", "가전", "가구" };
		
		for (int i = 0; i < 4; i++) {
			cate[i] = new CategoryVO();
			cate[i].setKind((i + 1) * 10);
			cate[i].setName(data[i]);
		}

		// LinkedList에 담아보자
		LinkedList cc = new LinkedList();
		for(int i = 0; i < 4; i++) {
			cc.add(cate[i]);
		}
		// 사이즈를 출력하시오
		System.out.println(cc.size());
		Iterator itr = cc.iterator();
		while(itr.hasNext()) {
			CategoryVO temp = (CategoryVO)itr.next();
			System.out.println(temp.getKind() + " "+ temp.getName());
		}
	}

}
