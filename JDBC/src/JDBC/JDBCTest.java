package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306";
			Connection con = DriverManager.getConnection(url, "root", "GGoopweb2024");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			System.out.println(e);
		}
	}

}
