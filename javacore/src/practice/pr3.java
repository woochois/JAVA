package practice;

import java.io.IOException;

public class pr3 {

	public static void main(String[] args) {
		clearConsole();
		System.out.println("hello");
	}
	
	public final static void clearConsole() {
		try {
			if(System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else Runtime.getRuntime().exec("clear");
		} catch(IOException | InterruptedException ex) {} 
	}

}
