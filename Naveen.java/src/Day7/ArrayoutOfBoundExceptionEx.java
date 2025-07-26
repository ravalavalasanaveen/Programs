package Day7;

import java.util.Scanner;

public class ArrayoutOfBoundExceptionEx 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);  
		int numbers[] = {10,20,30,40,50};
		
		try 
		{
			System.out.println("Enter the index you want to access(0 to 4)");
			int index = scanner.nextInt(); 
			System.out.println("Element at index " + index + " is: " + numbers[index]);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: Invalid Index. Please Enter index in between 0 and 4 ");
			System.out.println("\n");
			e.printStackTrace();
		}	
		
	}

}
