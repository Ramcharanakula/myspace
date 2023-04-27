package com.reg;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Empreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String employid=request.getParameter("Empid");
		String employname=request.getParameter("Empname");
		String employdes=request.getParameter("Empdesign");
		
		Employee e =new Employee();
		e.setEmpid(employid);
		e.setEmpname(employname);
		e.setEmpdesign(employdes);
		System.out.println(e);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","ramcharan@563");
			PreparedStatement ps = c.prepareStatement("insert into employee values(?,?,?)");
			ps.setString(1,e.empid);
			ps.setString(2,e.empname);
			ps.setString(3,e.empdesign);
			ps.executeUpdate();
			ResultSet r = ps.executeQuery("select * from employee");
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
				
			};c.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		RequestDispatcher rd = request.getRequestDispatcher("Empcon.html");
		rd.forward(request, response);
	}

}
