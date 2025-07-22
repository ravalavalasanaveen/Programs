package Day2;

public class MaxMinElement {

	public static void main(String[] args) {
		int[] arr = {25,45,10,8,26};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] <min) min=arr[i];
			if(arr[i] >max) max=arr[i];
		}
		
		System.out.println("Minimum = "+ min);
		System.out.println("Maximum = "+ max);

	}

}
