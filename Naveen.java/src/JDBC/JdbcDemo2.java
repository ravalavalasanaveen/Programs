package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 
{
	public static void main(String[] args) throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/navin"; 
		String userName = "root"; 
		String password = "Naveen@1503"; 
		// Load the register (mysql jdbc driver)
		try
		{
			// try to connect the installed package 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// JVM trying to load the jdbc class during the run time 
			// If the class is not found it will generate error 
		}
		
		catch (ClassNotFoundException e) 
		{
			System.err.println("My SQL driver is not found");
			e.printStackTrace();
			return;
		}
		
		// getConnection is a interface 
		
		try(Connection con = DriverManager.getConnection(url,userName,password);
				Statement stmt = con.createStatement())
		{
			String user = "CREATE TABLE users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), number VARCHAR(10))";
			stmt.executeUpdate(user); 
			System.out.println("Table users is created");
			
			// insert a row into the table 
			String val = "insert into users(name,number) values(?,?)";
			// To add multiple parameters 
			try (PreparedStatement ps = con.prepareStatement(val))
			{
				// prepared statement is a inbuilt statement in a interface class 
				ps.setString(1, "Ram"); 
				ps.setString(2, "1000");
				ps.addBatch();
				int[] allData = ps.executeBatch();
				// All the rows inserted into the database at a single batch  
				// Trying to find number the rows added / effected as like in the data base 
				System.out.printf("Inserted rows %d%n", (int)java.util.stream.IntStream.of(allData).filter(c -> c>0).count());	
			}
			
			String query= "SELECT * FROM users";
			
			try(ResultSet rs = stmt.executeQuery(query);)
			{
				
				while(rs.next())
				{
			
					String name = rs.getString(2);
					int number = rs.getInt(3);
					System.out.println("Name: " + name + " Number: " + number);
					
					stmt.close();
					con.close();
					
				}
				
			
			}
			
		}
		
		catch (SQLException e) 
		{
			System.out.println("Data Operation failed");
			e.printStackTrace();
		}
				
		
	}

}
