package practice;

public class Dia {
	public static void main(String[] args) {
				
		for(int i = 0; i < 5; i++){
			for(int j = 1; j < 5 - i; j++){ // ex) i가 0이면 빈칸 4개 , i가 1이면 빈칸 3개 ...
				System.out.print(" "); 
			}
			for(int j = 0; j < 2 * i + 1; j++){ // ex) i가 0이면 별 1개, i가 1이면 별 3개 ... 2개씩 증가
				System.out.print("*"); 
			}
			System.out.println("");
		}

		// 위에서 별을 9개까지 찍었으니 별 7개부터 시작
		for(int i = 0; i < 5; i++){
			for(int j = 10; j > 9 - i; j--){ // ex) i가 0이면 빈칸 1개 , i가 1이면 빈칸 2개 ...
				System.out.print(" "); 
			}
			for(int j = 8; j > 2 * i + 1; j--){ // ex) i가 0이면 별 7개, i가 1이면 별 5개 ... 2개씩 감소
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
		
	}
}
