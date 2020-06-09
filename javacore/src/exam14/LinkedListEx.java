package exam14;

import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer> lil = new LinkedList<Integer>();
		for(int i = 1; i < 101; i++) {lil.add(i);} // 1 ~ 100까지 추가
		System.out.println(lil); // 추가된 값 확인
		
		int sum = 0; // 합계
		for(Iterator<Integer> itr = lil.iterator(); itr.hasNext();) {
//			itr.next(); 홀수값
			sum += itr.next();
			itr.next(); // 짝수값
		}
		
		System.out.println(sum);
	}
}
