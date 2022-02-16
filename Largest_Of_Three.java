package Prog_Pack_1;

import java.util.Scanner;

public class prog_pack_1_largestof3
{

public static void main(String[] args)
{
int a,b,c;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

        if(a>b && a>c)
        System.out.println( "The largest number is "+a);
       
        else if (b>a && b>c)
        System.out.println("The largest number is "+b);
       
        else
        System.out.println("The largest number is "+c);
}

}

