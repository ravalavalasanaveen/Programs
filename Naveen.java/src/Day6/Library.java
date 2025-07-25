package Day6;

import java.util.Scanner;

final class FinalDemo
{
	final String library_Name = "City Central Library";
	
	final void showLibraryInfo(String visitorName)
	{
		System.out.println("\nHi "+visitorName +" Welcome to " + library_Name);
	}
	
	
	void libraryTimings()
	{
		System.out.println("Library is open from 9AM to 5PM");
		System.out.println("Happy Learning........");
	}
}

class Visitor
{
	String name; 
	
	Visitor(String name) 
	{
		this.name= name;
		
	}
		
	void visitorDetails()
	{
		FinalDemo finalDemo = new FinalDemo();
		
		finalDemo.showLibraryInfo(name);
		finalDemo.libraryTimings();
	}
	
}

public class Library
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter Visitor Name: ");
	   
	   String visitorName = sc.nextLine();
	   
	   Visitor visitor = new Visitor(visitorName);
	   
	   visitor.visitorDetails();    
	}

}
