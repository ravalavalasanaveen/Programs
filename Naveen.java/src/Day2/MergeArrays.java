package Day2;

public class MergeArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3}; 
		int b[]= {4,5,6};
		
		int c[] = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		for(int i=0 ; i<b.length; i++ )
		{
			c[a.length + i] = b[i];
		}

		
		System.out.println("Merged Array");
		
		for(int val : c)
		{
			System.out.println(val+ " ");
		}
	}

}
