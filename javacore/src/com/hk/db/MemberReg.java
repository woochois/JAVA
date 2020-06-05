package com.hk.db;
import java.sql.*;
public class MemberReg {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userID = "java", userPW = "1234";
		Connection con = null;
		Statement stmt = null;
		String sql = "insert into member values ('admin', '1234', '라일락꽃향기맡으며', '남', '2000.02.02', '010-2222-2222', sysdate, 'rwarwa@naver.com')";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userID, userPW);
			stmt = con.createStatement();
			int success = stmt.executeUpdate(sql);
			System.out.println("성공");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}	
		
	}
}
