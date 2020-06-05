package exam13;

import java.util.Scanner;

public class exam13_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String english = scan.nextLine();
		
		int consonant = 0, Vowel = 0, blank = 0;
		
		for(int i = 0; i < english.length(); i++) {
			String eng = english.valueOf(english.charAt(i));
			if(eng.equals("a")||eng.equals("e")||eng.equals("i")||eng.equals("o")||eng.equals("u")) {consonant++;}
			else if(eng.equals(" ")) { blank++;}
			else Vowel++;
		}
		System.out.println("모음 : " + consonant + "자음 : " + Vowel + "공백 : " + blank);
		
		// 다른 방법
		
		int conson = 0, Vowe = 0, blan = 0;
		
		for(int i =0; i < english.length(); i++) {
			if(english.charAt(i) == 'a'||english.charAt(i) == 'e'||english.charAt(i) == 'i'||english.charAt(i) == 'o'||english.charAt(i) == 'u') {conson++;}
			else if(english.charAt(i) == ' ') {blan++;}
			else Vowe++;
		}
		
		System.out.println("모음 : " + conson + "자음 : " + Vowe + "공백 : " + blan);
		
		// 다른 방법
		int cons = 0, Vow = 0, bla = 0;
		
		for(int i = 0; i < english.length(); i++) {
			switch (english.charAt(i)) {
			case 'a':case 'e':case 'i':case 'o':case 'u':cons++;
			case ' ':bla++;
			default:if(english.charAt(i) != ' ') {Vow++;}
				break;
			}

		}
		System.out.println("모음 : " + cons + "자음 : " + Vow + "공백 : " + bla);
	}
}
