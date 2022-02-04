package JavaPack;

import java.io.*;
import java.util.Scanner;

public class javapack_line_of_integers {

	public static void main(String[] args) throws IOException{
		int i,n;
		File f1 = new File("lineofnum.txt");
		
		if(f1.exists())
			System.out.println("File exists");
		
		else
		{
			f1.createNewFile();
			System.out.println("File created");
		}
		
		FileWriter fw = new FileWriter("lineofnum.txt",true);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements: ");
		n = sc.nextInt();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the elements: ");
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the number"+i+":");
			String no = br.readLine();
			fw.write(no+" ");
		}
		
		System.out.println("Numbers added");
		fw.close();
		
		FileReader fr = new FileReader("lineofnum.txt");
		BufferedReader br1 = new BufferedReader(fr);
		
		String s;
		while((s=br1.readLine())!=null)
			System.out.println(s);
		
		fr.close();
	}

}
