import java.util.Scanner;

public class prog_pack_1_swapwithtemp {

public static void main(String[] args) {

int a,b,temp;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st and 2nd numbers:");
a=sc.nextInt();
b=sc.nextInt();

        temp=a;
        a=b;
        b=temp;
       
        System.out.println("Value of 1st no. after swap: "+a);
        System.out.println("Value of 2nd no. after swap: "+b);
}

}


