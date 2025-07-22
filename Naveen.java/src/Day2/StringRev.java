package Day2;

public class StringRev {

	public static void main(String[] args) {
	
		String str = "Hello Java";
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		
		System.out.println("Reversed String: " + sb);

	}

}
