package Day9;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx 
{
	public static void main(String[] args) 
	{
		Collection data = new ArrayList(); 
		data.add(10);
		data.add(20);
		data.add(30);
		
		for(Object i : data)
		{
			int value = (Integer)i;
			System.out.println(value);
			System.out.println(value+1);
		}
		
	}

}
