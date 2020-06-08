package com.hk.collection;

import java.util.ArrayList;

import com.hk.vo.DolphinVO;
import com.hk.vo.LionVO;

public class ArrayListEx {
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
		
		for(int i = 0; i < zoo.size(); i++) {
			if(i==0||i==1) {
				LionVO temp1 = (LionVO)zoo.get(i);
				System.out.println(temp1.food);
			}else {
				DolphinVO temp1 = (DolphinVO)zoo.get(i);
				System.out.println(temp1.food);
			}
		}
		System.out.println(zoo.size());
	}
}
