package com.mindscript.cardekhowithservlet.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindscript.cardekhowithservlet.JDBC.DeleteJDBC;

@WebServlet("/deletecar")
public class DeleteCar extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int id=Integer.parseInt(req.getParameter("id"));
		
		int res=0;
		
		try 
		{
			res=DeleteJDBC.DeleteCar(id);
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res==1)
		{
			req.setAttribute("msg", "Car Deleted Successfully");
		}
		else
		{
			req.setAttribute("msg", "Failed to delete Car");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("DeleteCar.jsp");
		dispatcher.forward(req, resp);
	}
}
