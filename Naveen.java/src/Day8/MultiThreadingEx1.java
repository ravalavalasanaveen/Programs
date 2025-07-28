package Day8;

class Mul1 extends Thread
{
	public void run()
	{
		for(int i =1;i<=10;i++)
		{
			System.out.println("MultiThreading 1");
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
}

class Mul2 extends Thread 
{
	public void run()
	{
		for(int i=1;i<10;i++)
		{
		System.out.println("MultiThreading 2");
		
		try 
		{
			Thread.sleep(10);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
}

public class MultiThreadingEx1
{
	public static void main(String[] args)
	{
		Mul1 m1 = new Mul1();
		Mul2 m2 = new Mul2();
		
		//System.out.println(m2.getPriority());
		
		m1.start();
		
		try
		{
			Thread.sleep(5);
		} 
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		m2.start();
		
	}

}
