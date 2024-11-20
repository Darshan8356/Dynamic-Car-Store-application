package com.mindscript.cardekhowithservlet.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ViewJDBC 
{
	static Connection connection;
	static PreparedStatement preparedStatement;
	static ResultSet resultSet;
	
	public static void open() throws SQLException
	{
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?user=root&password=Root");
	}
	
	public static void close() throws SQLException
	{
		if(connection!=null)
		{
			connection.close();
		}
		
		if(preparedStatement!=null)
		{
			preparedStatement.close();
		}
	}
	
	public static List<CarsJDBC> ViewCars() throws SQLException 
	{
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		open();
		
		String query = "select * from car";
		preparedStatement=connection.prepareStatement(query);
		
		resultSet=preparedStatement.executeQuery();
		
		List<CarsJDBC> cars = new ArrayList<CarsJDBC>();
		
		while(resultSet.next())
		{
			CarsJDBC carsJDBC = new CarsJDBC();
			carsJDBC.setId(resultSet.getInt(1));
			carsJDBC.setName(resultSet.getString(2));
			carsJDBC.setBrand(resultSet.getString(3));
			carsJDBC.setPrice(resultSet.getDouble(4));
			
			cars.add(carsJDBC);
		}
		return cars;
	}
}