package JavaPack;

import java.io.*;

public class javapack_line_of_text {

	public static void main(String[] args) throws IOException {
		File f1 = new File("sample.txt");
		
		if(f1.exists())
			System.out.println("File exists");
		
		else
		{
			f1.createNewFile();
			System.out.println("File created");
		}
		
		try {
			 FileOutputStream fo = new FileOutputStream("sample.txt",true);
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 System.out.println("Enter the data: ");
			 String s = br.readLine();
			 byte[] a = s.getBytes();
			 
			 fo.write(a);
			 System.out.println("Data added");
			 
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
		
		int i = 0;
		FileInputStream fi = new FileInputStream("sample.txt");
		System.out.println(fi.available());
		
		while((i=fi.read())!=-1)
		{
			char x = (char)i;
			System.out.print(x);
		}
	}

}
