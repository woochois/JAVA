package com.hk.db;
import java.sql.*;
public class DbConnect {
	
	// static url
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	// userID
	static String userID = "java";
	
	// userPW
	static String userPW = "1234";
	
	// connection
	static Connection con = null;
	
	// statement
//	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	
	
	// result
	static ResultSet rs = null;
	
	// sql
	static String sql = null;
	
	public static void main(String[] args) {
		// JDBC 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userID, userPW);
		//	stmt = con.createStatement();
		//	sql = "select count(*) as total from worker";
		//	rs = stmt.executeQuery(sql);
			
			sql = "update worker set name = '김사장' where id = 'customer'";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "customer");
			rs = pstmt.executeQuery();
			System.out.println("접속성공");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			if(con != null) try {con.close();} catch(SQLException e) { }
		//	if(stmt != null) try {stmt.close();} catch(SQLException e) { }
			if(pstmt != null) try {pstmt.close();} catch(SQLException e) { }
			if(rs != null) try {rs.close();} catch(SQLException e) { }
		}
		
		// getConnect 접속
		
		// statement 
		
		// execute query
	}
}
