package practice;

public class Pr {

	public static void main(String[] args) {
		
		//		1. 중첩 반복문을 사용하여 삼각형을 작성하시오. 5x5 행렬 사용
		
		String[][] triangle = new String[5][5];
		
		for(int i = 0; i < triangle.length; i++) {
			for(int j = 0; j < i + 1; j++) {
				triangle[i][j] = "*";
				System.out.print(triangle[i][j] + " ");
			}System.out.println();
		}
	}

}
