package Day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "madam";
		
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		if(s.equals(sb.toString()))
		{
			System.out.println(s + " is a Palindrome");
		}
		else {
			System.out.println(s + "is not a Palindrome");
		}

	}

}
