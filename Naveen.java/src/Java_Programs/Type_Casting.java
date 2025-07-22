package Java_Programs;

public class Type_Casting {
	public static void main(String [] args)
	{
		int val= 20;
		double d = val;
		System.out.println("Implicit Type Casting: ");
	    System.out.println("int: "+ val);
	    System.out.println("double "+ d);
	    
	    double dd= 3.245;
	    int aa = (int) dd; 
	    System.out.println("\nExplicit type casting: ");
	    System.out.println("Double: "+ dd);
	    System.out.println("Int: "+ aa);
	}

}
