package com.nt.register;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws 
      ServletException, IOException {
	   
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   
	     //read form data
	   String uname = req.getParameter("uname");
	   String password = req.getParameter("password");
	   String email = req.getParameter("email");
	   String phoneNo = req.getParameter("phoneNo ");
	   
	   Member m = new Member(uname,password,email,phoneNo);
	   
	   RegisterDao rd = new RegisterDao();
	  String result= rd.insert(m);
	  res.getWriter().print(result);
		
	}//service
}//class
