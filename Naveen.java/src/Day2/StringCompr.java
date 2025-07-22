package Day2;

public class StringCompr {

	public static void main(String[] args) {
		String s = "Java"; 
		s.concat(" World");
		
		System.out.println("String (Immutable): "+ s);
		
		StringBuffer sb1 = new StringBuffer(s);
		
		sb1.append(" World"); 
		
		System.out.println("StringBuffer (mutable): " + sb1);
		
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" World");
        System.out.println("StringBuilder (mutable): " + sb2);  

	
	}

}
