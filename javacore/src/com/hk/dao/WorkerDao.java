package com.hk.dao;

import java.sql.*;

import oracle.jdbc.OracleConnection.CommitOption;

public class WorkerDao {
	// 상태 - 변수 (id, pw, connection ...)
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "java";
	static String password = "1234";
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;

	
	// 동작 - 메소드
	// getConn(), sql수행 메소드, dbclose()
	static void getConnect() {
		if(conn==null) {
			try {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection(url, user, password);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	static void dbclose() {
		if(conn!=null) {
			try {
				conn.close();
				conn=null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null) { 
			try{
				stmt.close(); 
				stmt=null;
			}catch(SQLException e){
				e.printStackTrace();
			} 
		}
	    if(conn!=null) { 
	    	try{
	    		conn.close();
	    		conn=null;
	    	}catch(SQLException e){
				e.printStackTrace();
	    	} 
	    }	
	}
	public int getTotalWorker() {
		int rst = 0;
		getConnect();// 디비접속
		try {
			stmt = conn.createStatement();
			String sql ="SELECT COUNT(*) AS TOTAL FROM WORK";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				rst = rs.getInt("TOTAL");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbclose(); // 디비종료
		return rst;
		
	}
	public int checkLogin(String id, String pw) {
		int rst = 0;
		getConnect();// 디비접속
		try {
			String sql ="SELECT COUNT(*) AS CNT FROM WORK WHERE ID = ? AND PWD = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				rst = rs.getInt("CNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbclose(); // 디비종료
		return rst;
		
	}
	public int updatePhone(String id, String phone) {
		int rst = 0;
		getConnect();// 디비접속
		try {
			String sql ="UPDATE WORK SET PHONE = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, id);
			rst = pstmt.executeUpdate(); // 수정이 되면 1, 아니면 0
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dbclose(); // 디비종료
		return rst;
		
	}
	 public WorkerVo getWorkerById(String id) {
	      WorkerVo temp = new WorkerVo();
	      getConnect();

	      try {
	          String sql="SELECT * FROM WORK WHERE ID = ?";
	          pstmt = conn.prepareStatement(sql);
	          pstmt.setString(1, id);
	          rs = pstmt.executeQuery();
			if(rs.next()) {
			     temp.setId(rs.getString("ID"));
			     temp.setPwd(rs.getString("PWD"));
			     temp.setName(rs.getString("NAME"));
			     temp.setPhone(rs.getString("PHONE"));
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      dbclose();      
	      return temp;
	   }

}
