package exam13;

import java.util.Scanner;

public interface exam13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 문장을 입력하시오. ");
		String hangul = scan.nextLine();
		System.out.print("입력한 문장 중에 있는 아무 글자 하나를 입력하시오. ");
		String text = scan.next();
			
		int count = 0;

		for(int i = 0; i < hangul.length(); i++) {
			if(text.equals(hangul.valueOf(hangul.charAt(i)))) {
				count++;
			}
		}
		System.out.println("총갯수는: " + count);
		

		// 다른 방법
		String[] n = hangul.split(text);
		
		int cnt = 0;
		
		for(int i = 1; i < n.length; i++) {
			cnt++;
		}
		System.out.println(cnt);
	}
	
}
