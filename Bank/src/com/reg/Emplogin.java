package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emplogin
 */
public class Emplogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		    String emp="12345";
			String empi= request.getParameter("Empi");
			String epass= request.getParameter("Empass");
			response.setContentType("text/html");
			Employee e =new Employee();
			e.setEmpid(empi);
			
			if(e.empid.equals(emp)) {
				PrintWriter p =response.getWriter();
				p.println("logged in");
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","ramcharan@563");
			PreparedStatement pr =con.prepareStatement("select * from employee where empid=?");
			pr.setString(1,e.empid);
			
			System.out.println("In try catch");
			ResultSet r = pr.executeQuery();
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
				
			};con.close();

	} catch (Exception e2) {
		// TODO Auto-generated catch block
		System.out.println(e2);
	}	
			}else {
				response.sendRedirect("https://www.youtube.com");
			}
			
	}

}
