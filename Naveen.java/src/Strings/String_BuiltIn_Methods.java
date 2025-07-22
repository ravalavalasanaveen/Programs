package Strings;

public class String_BuiltIn_Methods {
	
	public static void main(String[] args)
	{

	// Built In Methods 
	
	String text = "sjbbdfdjkhfhhhdndhdh";
	System.out.println(text.length());
	System.out.println(text.toUpperCase());
	System.out.println(text.toLowerCase()); 
	// hashcode 
	System.out.println(text.hashCode());
	
	// String Indexing 
	
	String txt = "Hi i am in india"; 
	System.out.println(txt.indexOf("in"));
	System.out.println(txt.indexOf("Hi"));
	
	//String Concatenation  
	
	String t = "Naveen";
	String y = "Kumar";
System.out.println(t + " " + y);

//Buitin method 

System.out.println(t.concat(y)); 


// String with Numbers 
 

String a = "10";
String b = "20";
System.out.println(a+b);

String aa = "10";
int bb = 30;
System.out.println(aa+bb);




// String With Special Characters 

// \", \' , \n , \t 

String msg = "Welcome to India!";
System.out.println(msg);

String msgg = "Welcome to \"India\"";
System.out.println(msgg);

String str = "It\'s Java Development";
System.out.println(str);

String message = "Hello \nWorld";
System.out.println(message);


String messages = "Hello \tWorld";   // \t means tab space 
System.out.println(messages);
	
}
}
