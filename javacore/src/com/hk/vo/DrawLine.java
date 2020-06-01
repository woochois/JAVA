package com.hk.vo;

public class DrawLine {
	public static void main(String[] args) {
		// drawLind 클래스에 함수 오버로딩 정의
		DrawLine line = new DrawLine();
		// ============== 선그리기 (20)
		line.draw();
		// 특정문자로 선그리기
		line.draw('*');
		line.draw('-');
		// 특정문자로 선그리기 및 길이입력
		line.draw('+',40);
	}
	public void draw() {
		for(int i = 0; i < 20; i++) {
			System.out.print("=");
		}System.out.println();
	}
	public void draw(char c) {
		for(int i = 0; i < 20; i++) {
			System.out.print(c);
		}System.out.println();
	}
	public void draw(char c, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(c);
		}System.out.println();
	}	
}
