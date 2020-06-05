package com.hk.db;

import java.sql.*;

public class MemberView {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userID = "java", userPW = "1234";
		Connection con = null;
		Statement stmt = null;
		String sql = "select * from member";
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userID, userPW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String empId = rs.getString("ID");
				String empPwd = rs.getString("PWD");
				String empName = rs.getString("NAME");
				String empGender = rs.getString("GENDER");
				String empBirthday = rs.getString("BIRTHDAY");
				String empPhone = rs.getString("PHONE");
				Date empRegdate = rs.getDate("REGDATE");
				String empEmail = rs.getString("EMAIL");
				System.out.println(empId + "|" + empPwd + "|" + empName + "|" + empGender + "|" + empBirthday + "|" + empPhone + "|" + empRegdate + "|" + empEmail);
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		
	}
}
