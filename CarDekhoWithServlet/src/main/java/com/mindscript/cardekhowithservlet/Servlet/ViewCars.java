package com.mindscript.cardekhowithservlet.Servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindscript.cardekhowithservlet.JDBC.CarsJDBC;
import com.mindscript.cardekhowithservlet.JDBC.ViewJDBC;

@WebServlet("/viewall")
public class ViewCars extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		List<CarsJDBC> cars=null;
		try 
		{
			cars = ViewJDBC.ViewCars();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.setAttribute("cars", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("ViewCars.jsp");
		requestDispatcher.forward(req, resp);
		
	}
}
