package com.mindscript.cardekhowithservlet.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindscript.cardekhowithservlet.JDBC.UpdateJDBC;

@WebServlet("/updatecar")
public class UpdateCar extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int res = 0;	
		
		try 
		{
			res=UpdateJDBC.UpdateCar(id, name);
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res==1)
		{
			req.setAttribute("msg", "Car name Updated Successfully");
		}
		else
		{
			req.setAttribute("msg", "Failed to update Car name");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("UpdateCar.jsp");
		dispatcher.forward(req, resp);
	}
}
