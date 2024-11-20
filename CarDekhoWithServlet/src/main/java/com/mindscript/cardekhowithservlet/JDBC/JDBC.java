package com.mindscript.cardekhowithservlet.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC 
{
	static Connection connection;
	static PreparedStatement preparedStatement;
	
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
	
	public static int AddCar(int id, String name, String brand, double price) throws SQLException
	{
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		open();
		
		String query = "Insert into car values(?,?,?,?)";
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, brand);
		preparedStatement.setDouble(4, price);
		
		int res=preparedStatement.executeUpdate();
		close();
		return res;
		
	}
}
