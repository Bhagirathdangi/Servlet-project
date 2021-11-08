package com.nt.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
   
	private String dburl="jdbc:mysql://localhost:3306/userdb";
	private String dbUname="root";
	private String dbPassword="root";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		
		try {
	  Class.forName(dbDriver);		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
		con=DriverManager.getConnection(dburl,dbUname,dbPassword);	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(Member m) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result="Data enterd successfully";
		String query = "insert into member values(?,?,?,?)";
		
		PreparedStatement ps;
		try {
			ps= con.prepareStatement(query);
			
			ps.setString(1, m.getUname());
			ps.setString(2, m.getPassword());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPhoneNo());
			
			ps.executeUpdate();
			
		}catch(Exception e) {
		e.printStackTrace();
		
		result="Data not inserted";
	} 
		return result;
}//class
}