package com.hk.db;
import java.sql.*;
public class DbConnect {
	   
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
   static String user = "java";
   static String password = "1234";
   
   static Connection conn = null;
   static Statement stmt = null;
   static ResultSet rs = null;

public static void main(String[] args) {
   
   // jdbc 로딩
   try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      conn = DriverManager.getConnection(url, user, password);
      // 접속 성공시 conn = 접속결과 객체값
      stmt = conn.createStatement();
      //String sql = "SELECT COUN(*) AS TOTAL FROM WORK";
      String sql ="SELECT ID, NAME FROM WORK WHERE ID ='admin'";
      // SQL문에 ";"는 제거
      rs = stmt.executeQuery(sql);
      String tempId ="";
      String tempName ="";
      String tempPwd = "";
      String tempPhone ="";
      
      if(rs.next()) { // 다음행에 로우값있으면 true - 값이 있나요?
         //System.out.println("리턴값 ="+rs.getInt("TOTAL"));
         //System.out.println("리턴값 ="+rs.getString("ID"));
         tempId = rs.getString(1);
         tempName = rs.getString("ID");
      }         
      System.out.println("리턴값 = "+tempId);
      System.out.println("리턴값 = "+tempName);
      System.out.println("드라이버 로딩성공, 접속성공");
   } catch(ClassNotFoundException e) {
      System.out.println("드라이버 로딩실패");
      e.printStackTrace();
   } catch (SQLException e2) {         
      System.out.println("드라이버 접속실패");
      e2.printStackTrace();
   } finally {
	   if(rs!=null) { try{rs.close(); rs=null;}catch(SQLException e){} } // 정리작업
	   if(stmt!=null) { try{stmt.close(); stmt=null;}catch(SQLException e){} } // 정리작업
	   if(conn!=null) { try{conn.close(); conn=null;}catch(SQLException e){} } // 정리작업
   }
   
   // getConnect 접속
   
   
   // statement

}

}