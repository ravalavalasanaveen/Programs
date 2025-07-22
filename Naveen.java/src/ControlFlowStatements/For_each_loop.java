package ControlFlowStatements;

public class For_each_loop {
	public static void main(String [] args)
	{
		String sports[]= {"cricket", "tennis","Hockey","Football"};
		
		for(String i : sports)
		{
			System.out.println(i);
		}
		
		
		
		// Break 
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			if(i==4)
			{
				break;
			}
		}
		
		
		// Continue 
		
		
		for(int i=0;i<10;i++)
		{
			
			if(i==3)
			{
				System.out.println("I am Reached");
				continue;
			}
			
			System.out.println(i);
		}
	}

}
