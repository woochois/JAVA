package exam10;

public class Board {
	public static void main(String[] args) {
		Dices myDices = new Dices();
		int faceValue1, faceValue2;
		faceValue1 = myDices.getDice1();
		faceValue2 = myDices.getDice2();
		System.out.println("첫 번째 주사위 : " + faceValue1 + ", 두 번째 주사위 : " + faceValue2);
	}
}
