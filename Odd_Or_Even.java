import java.util.Scanner;

public class prog_pack_1_oddoreven {

public static void main(String[] args) {

int a;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
a=sc.nextInt();

if(a%2==0)
System.out.println("The entered number is even: "+a);

else
System.out.println("The entered number is odd: "+a);
 

}

}

