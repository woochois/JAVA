package com.hk.exception;

public class ExceptMethod {
	public static void main(String[] args) {
		ExceptMethod  test = new ExceptMethod();
		try {
			test.loadJDBC();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 드라이버 로딩
	public void loadJDBC() throws ClassNotFoundException{
	     
		// 예외 발생 가능 예측 가능
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}
