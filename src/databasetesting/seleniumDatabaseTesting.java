package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class seleniumDatabaseTesting{
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/chaitanya", "root", "samba123");
		
		Statement st= conn.createStatement();
		ResultSet r=st.executeQuery("Select*from logindetails");
		
		
		
		while (r.next()) {
	
			System.out.println(r.getString(1)+"  "+r.getString(2));
		
		
		}
	
		
}}