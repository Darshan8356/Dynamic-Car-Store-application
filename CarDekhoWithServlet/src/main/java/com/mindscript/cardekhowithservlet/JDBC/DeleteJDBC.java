package com.mindscript.cardekhowithservlet.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteJDBC 
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
	
	public static int DeleteCar(int id) throws SQLException
	{
		Driver driver = new com.mysql.cj.jdbc.Driver();
		
		open();
		
		String query = "delete from car where id=?";
		preparedStatement=connection.prepareStatement(query);
		
 		preparedStatement.setInt(1, id);
 		
		int res=preparedStatement.executeUpdate();
		close();
		return res;
		
	}
}
