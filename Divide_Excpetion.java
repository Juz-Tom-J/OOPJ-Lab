package JavaPack;

import java.util.Scanner;

public class javapack_divide_exception {

	public static void main(String[] args) {
		int n1,n2,q;
		char k = 'Y';
		
		Scanner sc = new Scanner(System.in);
		
		while(k=='Y') {
			System.out.println("Enter the 1st no: ");
			n1=sc.nextInt();
			System.out.println("Enter the 2nd no: ");
			n2=sc.nextInt();
			
			try {
				q = n1/n2;
				System.out.println("Result: "+q);
				}
			      catch(Exception e) {
					System.out.println("Division by zero is not possible");
				} 
			      finally {
			    	  System.out.println("End of Division");
			      }
			
			System.out.println("Do you wanna continue (Y/N)");
			k = sc.next().charAt(0);
		}

	}

}
