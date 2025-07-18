package Java_Programs;


class Utils
{
	public static int add(int x,int y) {
		return x+y;
	}
}


public class Static_Method_Example {
	public static void main(String[] args)
	{
		int sum = Utils.add(50,10);
		System.out.println(sum );
	}

}
