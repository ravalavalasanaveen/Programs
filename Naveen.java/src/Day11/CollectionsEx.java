package Day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsEx
{
	public static void main(String[] args)
	{
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Python");
		courses.add("Data Structures");
		courses.add(".NET");
		
		for(String c : courses)
		{
			System.out.println(c);
		}
		
		Set<Integer> cc = new HashSet<>();
		cc.add(101);
		cc.add(105);
		cc.add(108);
		cc.add(110);
		
		for(Integer j : cc)
		{
			System.out.println(j);
		}
		
		Map<String, Integer>courseDuration = new HashMap<>();
		courseDuration.put("Java", 101);
		courseDuration.put("Python", 105);
		courseDuration.put("Data Structures", 108);
		courseDuration.put(".NET", 110);
		
		for(String c : courseDuration.keySet())
		{
			System.out.println(c + "=" + courseDuration.get(c));
		}
 		
	}

}
