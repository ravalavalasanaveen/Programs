package Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 
{
	int id;
	String name;
	
	public Student1(int id, String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id + " " + name;
	}
}

class Sorting implements Comparator<Student1>
{
	public int compare(Student1 a, Student1 b)
	{
		return a.name.compareTo(b.name);
	}
}

public class Sorting_Using_Comparator
{
	public static void main(String[] args)
	{
		ArrayList<Student1> list = new ArrayList<>();
		list.add(new Student1(2, "Ram"));
		list.add(new Student1(5, "Sita"));
		list.add(new Student1(3, "Shiva"));
		list.add(new Student1(8, "Anu"));
		Collections.sort(list,new Sorting());

		for(Student1 s : list)
		{
			System.out.println(s);
		}
		
	}

}
