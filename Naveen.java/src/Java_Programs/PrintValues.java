package Java_Programs;

public class PrintValues {
	public static void main(String[] args)
	{
		System.out.println("You passes "+ args.length+ " args");
		
		for(int i=0; i<args.length;i++)
		{
			System.out.println("args["+ i +"] "+ args[i]);
		}
	}

}
