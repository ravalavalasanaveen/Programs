package Day2;

public class ForLoop {
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i = "+ i);
		}
		
		
		
		// while loop 
		
		int j=1;
		
		while(j<=5)
		{
			System.out.println("j = "+ j );
			j++;
		}
		
		
		// do while 
		
		int i=1;
		
		do {
			System.out.println("i= "+i);
			i++;
		}while(i<=5);
		
		
		
		// Break 
		
		for(int m=0;m<=10;m++)
		{
			if(m==5)
			{
				break;
			}
			
			System.out.println("m= "+ m);
		}
		
		
		// Continue 
		
		for(int n=0;n<10;n++)
		{
			if(n==3)
			{
				continue;
			}
			
			System.out.println("n= "+ n);
		}
		
	}

}
