package Day2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int [] arr = {10,80,30,100,5};
		
		Arrays.sort(arr); 
		
		System.out.println("Sorted Array: ");
		for(int val : arr)
		{
			System.out.println(val);
		}

	}

}
