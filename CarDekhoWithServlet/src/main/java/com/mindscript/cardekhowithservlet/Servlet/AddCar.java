package com.mindscript.cardekhowithservlet.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindscript.cardekhowithservlet.JDBC.JDBC;

@WebServlet("/addcar")
public class AddCar extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String brand = req.getParameter("brand");
		double price = Double.parseDouble(req.getParameter("price"));
		int res=0;
		
		try 
		{
			res=JDBC.AddCar(id, name, brand, price);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res==1)
		{
			req.setAttribute("msg", "Car Added Successfully");
		}
		else
		{
			req.setAttribute("msg", "Failed to add Car");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("AddCAr.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}
