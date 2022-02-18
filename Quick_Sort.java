import java.util.Scanner;

public class quick_sort {

	public static void main(String[] args) {
		String temp;
		int n,i,j;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of names you want to enter:");
		n = s.nextInt();
		String names[] = new String[n];
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter all the names:");
		for(i = 0; i < n; i++)
		{
			names[i] = s1.nextLine();
		  }
		 
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (names[i].compareTo(names[j])>0)
				{
					temp = names[i];
		            names[i] = names[j];
		            names[j] = temp;
		           }
		       }
		   }
		   
		System.out.print("Names in Sorted Order:");
		 for (i = 0; i <(n - 1); i++)
		 {
		   System.out.print(names[i] + ",");
		  }
		   
		   System.out.print(names[n - 1]);
		 }
}
