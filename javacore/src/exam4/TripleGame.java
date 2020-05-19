package exam4;

import java.util.*;

public class TripleGame {

	public static void main(String[] args) {

		/*
		트리플게임
		어치 니 쌈 게임 
		구슬이 50개 - 랜덤으로 개수를 뽑음 
		
		어치(랜덤%3==1)
		니(랜덤%3==2)
		쌈(랜덤%3==0)
		 
		2인 게임. 
		위 3가지 항목 중 1개 선택 후, 승패 가리기
		같은 걸 선택 시, 에러 발생!!!
		*/
		
		Random random = new Random();

		String res = ""; // 어치 니 쌈 지정 문자열
		String res2 = ""; // 승부 결과 출력
		String res3 = ""; // 컴퓨터 선택 출력
		
		System.out.print("어치, 니, 쌈 중에 하나를 선택하시오. : ");
		Scanner scanner = new Scanner(System.in);
		
		String result = scanner.next(); // 플레이어 선택값 
		
		int result2 = random.nextInt(3); // 컴퓨터 랜덤 선택값
		int ran = random.nextInt(50) + 1; // 구슬 50개 중 랜덤 선택값
		
//	중복값 선택 시, 에러발생 강제종료코드
		
		if (result.equals("어치")) {
			if (result2 == 1) {
				System.out.println("컴퓨터의 선택 : 어치 \n에러 발생!!!\n중복된 값을 선택하셨습니다.\n강제종료합니다. 프로그램을 다시 시작해주세요.");
				System.exit(0);
			}
		} else if (result.equals("니")) {
			if (result2 == 2) {
				System.out.println("컴퓨터의 선택 : 니 \n에러 발생!!!\n중복된 값을 선택하셨습니다.\n강제종료합니다. 프로그램을 다시 시작해주세요.");
				System.exit(0);
			}
		} else if (result.equals("쌈")) {
			if (result2 == 0) {
				System.out.println("컴퓨터의 선택 : 쌈 \n에러 발생!!!\n중복된 값을 선택하셨습니다.\n강제종료합니다. 프로그램을 다시 시작해주세요.");
				System.exit(0);
			}
		} else System.out.println("잘못된 값을 입력하셨습니다. \n강제종료합니다. \n프로그램을 다시 시작해주세요.");
		
		

//		과제 코드
		if (ran % 3 == 1) {
			res = "어치"; // 나온 구슬 결과값
			if (result.equals("어치")) {
				if (result2 == 1) {
					res2 = "에러 발생!!!"; // 승부 결과값
					res3 = "어치"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "플레이어 승리";
					res3 = "쌈";
				} else if (result2 == 2) {
					res2 = "플레이어 승리";
					res3 = "니";
				}
			} else if (result.equals("쌈")) {
				if (result2 == 1) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "쌈"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "에러 발생!!!";
					res3 = "쌈";
				} else if (result2 == 2) {
					res2 = "무승부";
					res3 = "니";
				}
			} else if (result.equals("니")) {
				if (result2 == 1) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "니"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "무승부";
					res3 = "쌈";
				} else if (result2 == 2) {
					res2 = "에러 발생!!";
					res3 = "니";
				}
			}

		} else if (ran % 3 == 2) {
			res = "니"; // 나온 구슬 결과값
			if (result.equals("니")) {
				if (result2 == 2) {
					res2 = "에러 발생!!!"; // 승부 결과값
					res3 = "니"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "플레이어 승리";
					res3 = "쌈";
				} else if (result2 == 1) {
					res2 = "플레이어 승리";
					res3 = "어치";
				}
			} else if (result.equals("쌈")) {
				if (result2 == 2) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "니"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "에러 발생!!!";
					res3 = "쌈";
				} else if (result2 == 1) {
					res2 = "무승부";
					res3 = "어치";
				}
			} else if (result.equals("어치")) {
				if (result2 == 2) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "니"; // 컴퓨터의 선택값
				} else if (result2 == 0) {
					res2 = "무승부";
					res3 = "쌈";
				} else if (result2 == 1) {
					res2 = "에러 발생!!";
					res3 = "어치";
				}
			}
		} else if (ran % 3 == 0) {
			res = "쌈"; // 나온 구슬 결과값
			if (result.equals("쌈")) {
				if (result2 == 0) {
					res2 = "에러 발생!!!"; // 승부 결과값
					res3 = "쌈"; // 컴퓨터의 선택값
				} else if (result2 == 1) {
					res2 = "플레이어 승리";
					res3 = "어치";
				} else if (result2 == 2) {
					res2 = "플레이어 승리";
					res3 = "니";
				}
			} else if (result.equals("어치")) {
				if (result2 == 0) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "쌈"; // 컴퓨터의 선택값
				} else if (result2 == 1) {
					res2 = "에러 발생!!!";
					res3 = "어치";
				} else if (result2 == 2) {
					res2 = "무승부";
					res3 = "니";
				}
			} else if (result.equals("니")) {
				if (result2 == 0) {
					res2 = "컴퓨터 승리"; // 승부 결과값
					res3 = "쌈"; // 컴퓨터의 선택값
				} else if (result2 == 1) {
					res2 = "무승부";
					res3 = "어치";
				} else if (result2 == 2) {
					res2 = "에러 발생!!";
					res3 = "니";
				}
			}
		}
		System.out.println("나의 선택 : " + result + "\n" + "컴퓨터의 선택 : " + res3 + "\n" + "나온 구슬 : " + ran + "\n"
				+ "나온 결과 : " + res + "\n" + "승부 결과 : " + res2); // 출력값
	}
}
