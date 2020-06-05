package com.hk.db;
import java.sql.*;
public class DbConnect4 {
	   
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
      String sql ="delete from work where id=?";
      String id = "design";
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, id); // 1부터시작 : DB == ? 다 넣으면 sql 완성
      int success = pstmt.executeUpdate();
            
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