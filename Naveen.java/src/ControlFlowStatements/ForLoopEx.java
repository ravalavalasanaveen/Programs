package ControlFlowStatements;

import javax.print.attribute.standard.MediaSize.Other;

public class ForLoopEx {
	public static void main(String[] args)
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		
		// Nested Loops 
		
		// outer loop 
		
		for(int j=1;j<=2;j++)
		{
			System.out.println("Outer Loop: "+ j);
			
			// inner loop 
			
			for(int k=1;k<=3;k++)
			{
				System.out.println("Inner Loop: "+k);
			}
		}
	}

}
