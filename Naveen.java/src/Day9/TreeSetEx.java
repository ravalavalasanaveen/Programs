package Day9;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetEx 
{
	public static void main(String[] args) 
	{
		
	
	Collection data = new TreeSet();
	
	data.add(40);
	data.add(50);
	data.add(80);
	
	for(Object i : data)
	{
		int num = (Integer) i ;
		System.out.println(num);
		
		System.out.println(num+1);
	}
}
}