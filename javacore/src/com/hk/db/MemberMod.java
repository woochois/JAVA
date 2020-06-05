package com.hk.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberMod {
   
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
      
      String newBirth = "2020.02.02";
      String newPhone = "010-3333-6545";
      String newEmail = "bongbong@naver.com";
      String sql1 = "insert into member values ('flower', 'admin', '봉숭아꽃향기맡으며', '여', '2000.02.02', '010-2222-2222', sysdate, 'rwarwa@naver.com')";
      String sql2 ="UPDATE member SET BIRTHDAY='" + newBirth + "' , PHONE = '" + newPhone + "' , EMAIL = '" + newEmail + "' WHERE ID ='flower'";
      // SQL문에 ";"는 제거
      stmt.executeQuery(sql1);
      int success = stmt.executeUpdate(sql2);
            
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
   
   

}

}