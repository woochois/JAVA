package com.hk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDel {
	 static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   static String user = "java";
	   static String password = "1234";
	   
	   static Connection conn = null;
	   static Statement stmt = null;
	   static PreparedStatement pstmt = null;
	   

	public static void main(String[] args) {
	   
	   // jdbc 로딩
	   try {
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	      conn = DriverManager.getConnection(url, user, password);
	      // 접속 성공시 conn = 접속결과 객체값
	      String sql = "insert into member values ('design', '1234', '라일락꽃향기맡으며', '남', '2000.02.02', '010-2222-2222', sysdate, 'rwarwa@naver.com')";
	      String sql2 ="delete from member where id=?";
	      String id = "design";
	      stmt = conn.createStatement();
	      pstmt = conn.prepareStatement(sql2);
	      stmt.executeQuery(sql);
	      pstmt.setString(1, id); // 1부터시작 : DB == ? 다 넣으면 sql 완성
	      int success = pstmt.executeUpdate();
	            
	      conn.commit();
	      conn.close();
	      
	      System.out.println("성공값 = "+success);         
	      System.out.println("드라이버 로딩성공, 접속성공");
	   } catch(ClassNotFoundException e) {
	      System.out.println("드라이버 로딩실패");
	      e.printStackTrace();
	   } catch (SQLException e2) {         
	      System.out.println("드라이버 접속실패");
	      e2.printStackTrace();
	   }
	   
	   // getConnect 접속
	   
	   
	   // statement

	}

	}