package exam10;

import java.util.Random;

public class Dices1 {
	// 선생님 코드
	
	// 상태
	int faceValue1; // 1 2 3 4 
	int faceValue2; 
	int width = 3; // 예제 상
	
	// 행동
	void roll() {
		Random zen = new Random();
		faceValue1 = zen.nextInt(6)+1;
		faceValue2 = zen.nextInt(6)+1;
	}
	int getDice1() {
		return faceValue1;
	}
	int getDice2() {
		return faceValue2;
	}
	public static void main(String[] args) {
		Dices1 myDice1 = new Dices1();
		
		myDice1.roll();
		
		System.out.println("첫 번째 주사위 : " + myDice1.getDice1() + " 두 번쨰 주사위 : " + myDice1.getDice2());
		
		
	}
}
