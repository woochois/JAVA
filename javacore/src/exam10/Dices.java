package exam10;

public class Dices {

	static int width = 3;
	int faceValue1, faceValue2;
	
	void roll() {
		faceValue1 = (int)(Math.random() * 6) + 1;
		faceValue2 = (int)(Math.random() * 6) + 1;
	}
	int getDice1() {
		return faceValue1;
	}
	int getDice2() {
		return faceValue2;
	}
	public static void main(String[] args) {
		Dices myDices = new Dices();
		myDices.roll();
		System.out.println("첫 번째 주사위 : " + myDices.getDice1() + ", 두 번째 주사위 : " + myDices.getDice2());
	}

}
