package Java_Programs;

public class Calculator_RuntimeData {
	 // if we change the class name like example Calculator we will get  java.lang.ClassNotFoundException:
	
	public int add(int a, int b) {
		// add Method 
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Calculator_RuntimeData calc = new Calculator_RuntimeData();
//		Object creation 
		int sum = calc.add(3,4);
		// calling the add method
		System.out.println("Sum ="+ sum);
	}

}
