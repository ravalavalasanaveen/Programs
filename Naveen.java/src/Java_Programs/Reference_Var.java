package Java_Programs;

class Person{
String name; 
Person(String name) // constructor 
{
	this.name=name; 
}

public String toString()
{
	return name;
}
	
}

public class Reference_Var { // main class 
	
	public static void changeName(Person p)
	{
		p.name= "Changed";
	}
	
	public static void main(String[] args)
	{
		int a =10;
		int b = a;
		b= 20;
		System.out.println("a: "+ a);
		Person p1 = new Person("Ram");
		Person p2 = p1; // p1 and p2 point to same person object 
		p2.name= "Ramu";
		System.out.println("p1= "+ p1);
		changeName(p1);
		System.out.println("p1 after changeName=" + p1);
		
	}
	
	

}
