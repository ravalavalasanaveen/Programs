package Day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class CSVFile
{
	public static void main(String[] args) 
	{
		String filePath = "C:\\files\\annual-enterprise-survey-2024-financial-year-provisional.csv";
		
		BufferedReader bufferedReader = null;
		
		try 
		{
			FileReader fileReader = new FileReader(filePath);
			
// BufferedReader bufferedReader = new BufferedReader(fileReader);
		
			bufferedReader  = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line!= null)
			{
				System.out.println(line);
				//Reads next line 
				line = bufferedReader.readLine();
			}
						
		}
		
		catch (Exception e) 
		{
			System.out.println("Error Reading File "+ e.getMessage());
			
			System.out.println("\n");
			e.printStackTrace();
		}
		
		
		finally
		{
			if(bufferedReader!= null)
			{
				try 
				{
					bufferedReader.close();
				}
				catch (Exception e2) 
				{
					System.out.println("Error Closing reader: "+ e2.getMessage());
				}
				
			}
			
		}
		
	}

}
