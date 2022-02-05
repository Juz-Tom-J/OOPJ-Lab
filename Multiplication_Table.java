package JavaPack;

import java.util.*;

class MultTable
{ void printTable(int n)
	{synchronized(this)
	 {
		for(int i=0;i<=5;i++)
		{System.out.println(n+"*"+i+"="+n*i);
		 try {
			 Thread.sleep(400);
		 }catch(Exception e)
		 {System.out.println(e);}
		}
	 }
   }
}

class Table extends Thread
{
	MultTable t;
	int num;
	
	Table(MultTable t,int num)
	{
		this.t = t;
		this.num = num;
	}
	
	public void start()
	{ 
		t.printTable(num);
	}
}
public class javapack_mult_of_3_sync {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultTable tab = new MultTable();
		
		System.out.println("Enter the table you want to run by thread 1: ");
		int n = sc.nextInt();
		Table t1 = new Table(tab,n);
		
		System.out.println("Enter the table you want to run by thread 2: ");
		n = sc.nextInt();
		Table t2 = new Table(tab,n);
		
		System.out.println("Enter the table you want to run by thread 3: ");
		n = sc.nextInt();
		Table t3 = new Table(tab,n);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
