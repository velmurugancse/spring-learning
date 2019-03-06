package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbb
 */
@WebServlet("/TestDbb")
public class TestDbb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String jdbcUrl ="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String usr = "springstudent";
		String pwd ="springstudent";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter out = response.getWriter();
			
			Class.forName("com.mysql.jdbc.Driver"); 
			out.write("connecting to database:"+jdbcUrl);
			 
			Connection con= DriverManager.getConnection(jdbcUrl,usr,pwd);
			out.write("\nConnected successfully");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	
	
	}

}
