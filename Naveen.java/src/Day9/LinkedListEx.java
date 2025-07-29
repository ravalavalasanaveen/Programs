package Day9;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ForkJoinPool;

public class LinkedListEx 
{
	public static void main(String[] args) 
	{
		Collection data = new LinkedList();
		
		data.add(10);
		data.add(20);
	//	data.add("80");
	//	data.add("100e");
		data.add(13);
		
		 for(Object i : data)
		 {
		      int num =(Integer) i;
			 System.out.println(i);
			 System.out.println(num*2);
		 }
		
	}

}
