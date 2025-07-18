package Java_Programs;

class Counter{
	int count =0; 
	public void increment()
	{
		count++;
	}
	
	public int getCount()
	{
		return count;
	}
}

public class Non_Static_Method {
	public static void main(String[] args)
	{
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.increment();
		c2.increment();
		c2.increment();
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
	}

}
