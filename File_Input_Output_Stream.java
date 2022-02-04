package JavaPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class javapack_file_input_output_stream {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
				Scanner sc = new Scanner(System.in);
				
				int i,n,num;
				
				File f1 = new File("number.txt");
				if(f1.exists())
					System.out.println("File Exists");
				else
				   {
					f1.createNewFile();
					System.out.println("File Created ");
				   }
				
				FileOutputStream fout =new FileOutputStream("number.txt");
				
				System.out.print(" Enter the number of elements: ");
				n = sc.nextInt();
				
				for(i=0;i<n;i++)
				{
					System.out.print("\nEnter the number "+(i+1)+": ");
					num=sc.nextInt();
					fout.write(num);
				}
				fout.close();
				
				i=0;
				
				FileInputStream fin =new FileInputStream("number.txt");
				
				System.out.print("\n\nThe elements are: ");
				while((i=fin.read())!=-1) {
					System.out.print(i);
				}
				fin.close();
			}

		}
