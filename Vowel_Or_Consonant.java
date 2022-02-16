package Prog_Pack_1;

import java.util.Scanner;

public class prog_pack_1_vowelorconsonant {

public static void main(String[] args) {

char l;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the letter:");
l=sc.next().charAt(0);

if(l=='A'||l=='a'||l=='E'||l=='e'||l=='I'||l=='i'||l=='O'||l=='o'||l=='U'||l=='u')
System.out.println("The entered character is a vowel: "+l);

else if(l>=48 && l<=57)
System.out.println("The entered number is a digit between 0-9: "+l);
 
else
System.out.println("The entered number is a consonant: "+l);

}

}

