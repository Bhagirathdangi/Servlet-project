package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/student")
public class StudentRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

  public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
      ServletException, IOException {
		
	  PrintWriter pw = res.getWriter();
	  res.setContentType("text/html");
	  
	  //read form data
	  
	  String firstName = req.getParameter("fname");
	  String lastName  = req.getParameter("lname");
	      String email = req.getParameter("email");
	   String password = req.getParameter("pwd");
	      long phoneNo = Long.parseLong(req.getParameter("phoneNo"));
	    String address = req.getParameter("adrs");
	    
	    try {
	  Class.forName("oracle.jdbc.driver.OracleDriver"); 
	  Connection con = DriverManager.getConnection
			  ("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	  
        String query="INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";
      PreparedStatement ps = con.prepareStatement(query); 
      
         ps.setString(1, firstName);
         ps.setString(2, lastName);
         ps.setString(3, email);
         ps.setString(4, password);
         ps.setDouble(5, phoneNo);
         ps.setString(6, address);
         
         ps.executeUpdate();
     pw.println("<h2 style='color:blue;text-align:center'>Recored update Successfully</h2>");    
	    con.close();	
	    }catch(Exception e) {
	     e.printStackTrace();
	    }
	}//service

}//class
