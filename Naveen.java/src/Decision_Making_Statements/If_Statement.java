package Decision_Making_Statements;

public class If_Statement {
	
	public static void main(String[] args)
	{
		int a =10;
		int b =20;
		if(a>b)
		{
			System.out.println("A is Bigger than B");
		}
		else {
			System.out.println("B is Bigger than a ");
		}
		
		// if else if else
		
		int aa=20;
		
		
		if(aa>92) {
			System.out.println("First Class");
			
		}
		
		else if(aa>=35)
		{
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Fail");
		}
		
	
	
	// Ternary Operator -- Make the statement simple and short 
	
	
	int marks = 25; 
	String result = (marks<35)?"Not Completed.":"Completed";
    
	System.out.println(result);
	
	
	
	
	
	}
	

}
