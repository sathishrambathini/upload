package com.agile.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conn 
{
public static Connection getconn()
{
	Connection con = null;
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306?user=root&password=root123";
		String query= "";
		try 
		{
			con = DriverManager.getConnection(url);
			PreparedStatement pstmp = con.prepareStatement(query);
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	} 
    catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	}
	return con;
}
}
