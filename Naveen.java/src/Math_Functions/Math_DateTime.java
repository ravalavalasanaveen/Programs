package Math_Functions;
import java.time.LocalDate; // imprting local date class 

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Math_DateTime {
	
	public static void main(String[] args)
	{
		// Date time coding 
		
		// display current date 
		
		LocalDate myDate = LocalDate.now(); 
		
		System.out.println(myDate);
		
		
		// Display current time 
		
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		
		// Display current date and time at single shot 
		
		LocalDateTime mDateTime = LocalDateTime.now();
		System.out.println(mDateTime);
		
		
		// Custom Date time Format 
		
		LocalDateTime myDateTimeobj = LocalDateTime.now();
		System.out.println("Before Formatting Date and Time : "+ myDateTimeobj);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateTimeobj.format(myFormat);
		
		System.out.println("After Formatting Date and Time: "+ formattedDate);
		
		
		
		
	}

}
