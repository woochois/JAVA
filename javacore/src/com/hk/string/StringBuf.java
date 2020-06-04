package com.hk.string;

public class StringBuf {
	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("초기문자열");
		
		//문자열 추가
		sbf.append("=abcdefg");
		//문자열 추가
		sbf.append("+여름이 왔어요");
		
		String str = sbf.toString(); // 
		System.out.println(str);
		
		
		// 2 + 1.3125 * 23 / 4 -> input
		String exp = "2";
		exp += " + ";
		exp += "1.3125";
		exp += " * ";
		exp += "23";
		exp += " / ";
		exp += "4";
		System.out.println(exp);

		
	}
}
