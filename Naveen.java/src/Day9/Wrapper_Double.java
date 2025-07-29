package Day9;

public class Wrapper_Double 
{
	public static void main(String[] args) 
	{
		Double d = 45.25;
		Float f = 23.56f;
		String string = "99";
		Long l = 1000L;
		
		
		int i = d.intValue();
		int j = f.intValue();
		int k = Integer.parseInt(string);
		int m = l.intValue();
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		
	}

}
