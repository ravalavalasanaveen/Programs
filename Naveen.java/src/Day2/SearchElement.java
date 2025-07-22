package Day2;

public class SearchElement {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		int key = 30;
		
		boolean result = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				System.out.println("Element is found at index "+ i);
				result=true;
				break;
			}
		}
		
		if(!result)
		{
			System.out.println("Element is not found");
		}

	}

}
