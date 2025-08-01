package Day12;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx 
{
	public static void main(String[] args) throws IOException
	{
		FileReader reader = new FileReader("C:\\Users\\navee\\Downloads\\Wipro Training\\Example.txt");
		int ch;
		
		while((ch = reader.read())!=-1)
		{
			System.out.println((char)ch);
		}
		
		reader.close();
		
	}

}
