package com.hk.string;

	public class StringMethod2 {
		public static void main(String[] args) {
			String article = "Court begins process to sell assets " + "of Japanese firm involved " + "in wartime forced labor";
			String[] word = article.split(" ");
			int i = 0;
			while(i < word.length) {
				System.out.println(word[i]);
				i++;
			}
			String test = "010-3123-1232|롸롸|rwarwa";
			test.split("|");
			
			// split 없이 Japanese 만 출력
			System.out.println(article.substring(39, 47));
			
			int start = article.indexOf('J'); // J가 처음 시작하는 위치 - 정수값
			int end = start + 8;
			String result = article.substring(start, end);
			System.out.println(result);
			
			article.contains("aaa");
		}
}
