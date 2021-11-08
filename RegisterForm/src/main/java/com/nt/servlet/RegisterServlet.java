package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
   
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
	//	pw.println("<h2 style='color:red'>Welcome to Register Servlet</h2>");
		
		//read form data
		
		
		
		String name = req.getParameter("uname");
		String email= req.getParameter("uemail");
	    String pass	= req.getParameter("upass");
	    String phoneNo=req.getParameter("phoneNo"); 
	   String gender= req.getParameter("gender");
	   String course= req.getParameter("course");
	   String condi = req.getParameter("condition");
				
		//b.logic
	   if(condi!=null)
	   {
	   if(condi.equals("checked"))
	   {
	   pw.println("<h2>Name : "+name+"</h2>");
	   pw.println("<h2>Email : "+email+"</h2>");
	   pw.println("<h2>Pass : "+pass+"</h2>");
	   pw.println("<h2>phoneNo : "+phoneNo+"</h2>");
	   pw.println("<h2>Gender : "+gender+"</h2>");
	   pw.println("<h2>Course : "+course+"</h2>");
	   pw.println("<h2>Condi : "+condi+"</h2>");
	  
	   }//if condi
	   else {
		   pw.println("<h2 style='color:red';>you have not checked terms and condition!</h2>");
	   }
	   }else {
		   pw.println("<h2 style='color:red';>you have not checked terms and condition!</h2>");  
	   }
	   pw.close();
	}//service
}//class
