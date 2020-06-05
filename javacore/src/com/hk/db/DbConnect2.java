package com.hk.db;
import java.sql.*;
public class DbConnect2 {
	   
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
   static String user = "java";
   static String password = "1234";
   
   static Connection conn = null;
   static Statement stmt = null;
   

public static void main(String[] args) {
   
   // jdbc 로딩
   try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      conn = DriverManager.getConnection(url, user, password);
      // 접속 성공시 conn = 접속결과 객체값
      stmt = conn.createStatement();
      //String sql = "SELECT COUN(*) AS TOTAL FROM WORK";
      String sql ="INSERT INTO WORK \r\n" + 
            "VALUES('emp', '1234', '윤택상', '010-3434-5432')";
      // SQL문에 ";"는 제거
      int success = stmt.executeUpdate(sql);
            
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