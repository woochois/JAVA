package exam10;

public class Board {
	public static void main(String[] args) {
		Dices myDices = new Dices();
		myDices.roll();
		System.out.println("첫 번째 주사위 : " + myDices.getDice1() + ", 두 번째 주사위 : " + myDices.getDice2());
	}
}
