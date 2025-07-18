package Naveen;

public class DataType {
public static void main(String args[])
{
	int a=100;
	System.out.println(a);
	float b=99;
	System.out.println(b);//IMPLICIT CONVERSION INT IS LOWER DATA TYPE AS COMPARED TO FLOAT FROM LOWER TO HIGHER IMPLICIT CONVERSION 
	float c=99.9f;
	int d=(int)c;//EXPLICIT CONVERSION HIGHER TYPE TO LOWER TYPE 
	System.out.println(c);
	System.out.println(d);
	short e=9000;
	System.out.println(e);
	double f=999.900987;
	System.out.println(f);
	boolean g=true;
	System.out.println(g);
	char i='a';
	System.out.println(i);
	byte j=9;
	System.out.println(j);
	
}

}
