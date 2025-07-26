package Day7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;


public class Excel 
{
	 public static void main(String[] args) {
	    	String filePath = "C:\\files\\FSI-2023-DOWNLOAD.xlsx";
	        BufferedReader reader = null;

	        try {
	            FileReader fileReader = new FileReader(filePath);
	            reader = new BufferedReader(fileReader);

	            String line = reader.readLine();

	            while (line != null) {
	                System.out.println(line); // Print each line as-is
	                line = reader.readLine(); // Move to next line
	            }
	        }
	        catch (Exception e) 
	        {
	            System.out.println("Error reading file: " + e.getMessage());
	        } 
	        finally
	        {
	            try 
	            {
	                if (reader != null) 
	                	{
	                	reader.close();
	                	}
	            } 
	            catch (Exception e2)
	            {
	                System.out.println("Error closing file: " + e2.getMessage());
	            }
	        }
	    }

}
