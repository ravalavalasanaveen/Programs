package Day3;

class Student{
	String Name; 
	int age; 
	
	void display()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Age: "+ age);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.Name="Ram";
		s1.age=22;
		s1.display();
	}

}
