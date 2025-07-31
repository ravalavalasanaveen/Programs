package Day11;

import java.io.FileWriter;
import java.io.Writer;

public class WritingToFile 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fileWriter = new FileWriter("C:\\Users\\navee\\Downloads\\Wipro Training\\Example.txt");
			
			fileWriter.write("Hello Welcome to Java Selenium");
			
			fileWriter.close();
			System.out.println("Data written to file successfully ");
		}
		
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
