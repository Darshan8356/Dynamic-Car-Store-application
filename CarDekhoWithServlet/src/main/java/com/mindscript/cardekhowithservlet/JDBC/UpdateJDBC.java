package com.mindscript.cardekhowithservlet.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateJDBC 
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
	
	public static int UpdateCar(int id,String name) throws SQLException
	{
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		open();
		
		String query = "Update car set name = ? where id=?";
		preparedStatement=connection.prepareStatement(query);
		
 		preparedStatement.setString(1, name);
 		preparedStatement.setInt(2, id);
 		
		int res=preparedStatement.executeUpdate();
		close();
		return res;
		
	}
}
