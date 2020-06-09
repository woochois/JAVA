package exam14;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			al.add((int)(Math.random() * 90) + 10); // 최소갑 10, 최대값 99
		}
		System.out.println(al);
		
		int sum = 0;
		
		for(Iterator<Integer> itr = al.iterator(); itr.hasNext();) {
				sum += itr.next();
		}
		System.out.println("합계 : " + sum);
	}
}
