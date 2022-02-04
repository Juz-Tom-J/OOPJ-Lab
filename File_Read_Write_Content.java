package JavaPack;

import java.io.*;

public class javapack_read_write_content {

	public static void main(String[] args) throws IOException {
		File f1 = new File("content.txt");
		
		if(f1.exists())
			System.out.println("File exists");
		
		else
		{
			f1.createNewFile();
			System.out.println("File created");
		}
		
		FileWriter fw = new FileWriter("content.txt",true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter data: ");
		String s = br.readLine();
		fw.write(s+" ");
		
		System.out.println("Content added");
		fw.close();
		
		FileReader fr = new FileReader("content.txt");
		BufferedReader br1 = new BufferedReader(fr);
		
		String s1;
		while((s1=br1.readLine())!=null)
			System.out.println(s1);
		
		fr.close();
	}

 }
