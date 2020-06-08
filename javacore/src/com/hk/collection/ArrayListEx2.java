package com.hk.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.hk.vo.DolphinVO;
import com.hk.vo.LionVO;

public class ArrayListEx2 {
	public static void main(String[] args) {
		LionVO king = new LionVO();
		king.food = "라일락";
		
		LionVO baby = new LionVO();
		baby.food = "나일락";
		
		DolphinVO swim = new DolphinVO();
		swim.food = "가일락";
		
		DolphinVO fast = new DolphinVO();
		fast.food = "다일락";
		
		ArrayList zoo = new ArrayList();
		zoo.add(king); // 기본타입 - 객체타입 저장 가능
		zoo.add(baby);
		zoo.add(swim);
		zoo.add(fast);
		
		Iterator itr = zoo.iterator();
		int idx = 0;
		while(itr.hasNext()) {
			if(idx==0||idx==1) {
				LionVO temp1 = (LionVO)itr.next();
				System.out.println(temp1.food);
			}else {
				DolphinVO temp1 = (DolphinVO)itr.next();
				System.out.println(temp1.food);
			}idx++;
		}
	}
}
