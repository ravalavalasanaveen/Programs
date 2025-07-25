package Day6;

interface DemoInterface {
	
	default void defaultMethod()
	{
		System.out.println("This is Default Method");
	}
	
	static void staticMethod()
	{
		System.out.println("This is Static Method");
	}
	
	void abstractMethod();
}


class MethodType implements DemoInterface
{
	
	@Override
	public void abstractMethod()
	{
		System.out.println("This is Normal Method");	
	}
	
	
	static void classStaticMethod()
	{
		System.out.println("This is Static Method in class");
	}
	
}

public class DemoClass 
{
	
	public static void main(String[] args) 
	{
	
		MethodType methodType = new MethodType();
		
		methodType.abstractMethod();
		
		
		methodType.defaultMethod();
		
		// Class level static method is calling using the class name 
		MethodType.classStaticMethod();
		
	 // Calling static method from interface using the interface name 
		
		DemoInterface.staticMethod();
		
	}

}
