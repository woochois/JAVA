package com.hk.collection;

import java.util.*;

public class VectorEx {
	
	public static void main(String[] args) {
		// 벡터 클래스
		Vector book = new Vector();
		
		// String 배열
		String[] bk = new String[5];
		
		book.add("java");
		book.add("jsp");
		book.add("oracle");
		book.add("html");
		book.add("css");
		book.add(3, "javascript");
		
		for(int i =0; i < book.size(); i++) {
			System.out.println(book.get(i));
		}
		System.out.println("총갯수 = " + book.size());
		System.out.println("맨처음데이터 =" +book.firstElement());
		System.out.println("맨마지막데이터 =" +book.lastElement());
		
		//
		bk[0] = "java";
		bk[1] = "jsp";
		bk[2] = "oracle";
		bk[3] = "javascript";
		bk[4] = "html";
		
		for(int i = 0; i < bk.length; i++) {
			System.out.println(bk[i]);
		}
		System.out.println("총갯수(고정) = " + bk.length);
	}
	
}
