package databasetesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumDataBaseTesting2 {
	private Connection connection;
	   private static Statement statement;
	   private static ResultSet rs;

	   @BeforeClass
	    public void setUp() {
	            String databaseURL = "jdbc:mysql://localhost:3306/chaitanya";
	            String user = "root";
	            String password = "samba123";
	            connection = null;
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	    }
	   @Test(priority=1)
	    public void getEmployeesFromDataBase() {
	        try {
	            String query = "select * from employee";
	            statement = connection.createStatement();
	            rs = statement.executeQuery(query);
	      
	            while(rs.next()){
	            	
	                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
	            }
	        } catch (SQLException ex) {
	           ex.printStackTrace();
	        }
	    }
	   @Test(priority=2)
	   public void customer() throws SQLException{
		   Statement st= connection.createStatement();
			ResultSet r=st.executeQuery("Select*from customers");
			while (r.next()) {
				
				System.out.println(r.getString(1)+"  "+r.getString(2));
			
			
			}
	   }
	   @AfterClass
	    public void tearDown() {
	      if (connection != null) {
	                try {
	                    System.out.println("Closing Database Connection...");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	      }
	   
}
