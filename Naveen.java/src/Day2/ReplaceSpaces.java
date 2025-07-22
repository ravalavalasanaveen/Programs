package Day2;

import java.net.SocketTimeoutException;

public class ReplaceSpaces {

	public static void main(String[] args) {
		String str = "Java is Easy"; 
		
		String replace = str.replace(" ", "-");
		
		System.out.println("Replaced String is "+ replace);

	}

}
