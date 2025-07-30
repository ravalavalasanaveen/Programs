package Day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(Student s)
	{
		// Sorting rule
		return this.id-s.id;
	}
	
	public String toString()
	{
		return id + " " + name;
	}
}

public class StudentsSorting_Comparable 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(2, "Ram"));
		list.add(new Student(1, "Laxman"));
		list.add(new Student(5, "Shiva"));
		list.add(new Student(3, "Anu"));
		
		// Perform Sorting
		Collections.sort(list);
		
		for(Student s: list)
		{
			System.out.println(s);
		}
		
	}

}
