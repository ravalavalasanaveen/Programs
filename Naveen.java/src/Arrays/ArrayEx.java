package Arrays;

public class ArrayEx {
	public static void main(String[] args)
	{
		// Arrays 
		
		String cars[] = {"Honda", "Mahindra", "Tata", "Tesla", "Ford"};
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		
		int price[]= {20,30,40,50,60};
		
		//for each  
		
		
		
		for(String j  : cars)
		{
			System.out.println(j);
		}
		
		
		// Multidimensional Array 
		
		
		int myNumbers[][]= {{2,3,4},{1,2,3,4}};
		
		System.out.println(myNumbers[1][2]);
	}

}
