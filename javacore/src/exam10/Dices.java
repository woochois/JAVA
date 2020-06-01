package exam10;

public class Dices {

	static int width = 3;
	
	public int roll() {
		int dice1 = (int)(Math.random() * 6) + 1;
		return dice1;	
	}
	public int getDice1() {
		return roll();
	}
	public int getDice2() {
		return roll();
	}
	
	public static void main(String[] args) {
		Dices myDices = new Dices();
		int faceValue1, faceValue2;
		faceValue1 = myDices.getDice1();
		faceValue2 = myDices.getDice2();
		System.out.println("첫 번째 주사위 : " + faceValue1 + ", 두 번째 주사위 : " + faceValue2);
	}
}
