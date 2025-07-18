package Naveen;

public class ShiftEx {
public static void main(String args[])
{
	int a=11;
	System.out.println(a<<2);
	//10=001010 comes to last that 2 0's then 101000 then it becomes 40 
	System.out.println(a>>2);
    //10=001010 it sends last 10 to front i.e 000010 i.e 2 
	System.out.println(a>>>2); 	
}

}

