package com.macq.ci.tools.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseJDBCDao {
	
	private static Connection connection;

	{
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			BaseJDBCDao.connection = DriverManager.getConnection(
					"jdbc:jtds:sybase://bfssyddev47:20020/sd_wrap", "sduser",
					"nicegirl");

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

}
