package Prog_Pack_1;

import java.util.Scanner;

public class prog_pack_1_palindrome {

public static void main(String[] args) {

String character,char_copy,reverse= "";
int len,i;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a word: ");
character=sc.nextLine();
char_copy=character;
len=character.length();

for(i=len-1;i>=0;i--)
reverse+=character.charAt(i);

if(character.equals(reverse))
System.out.println(char_copy+" is a palindrome");
else
System.out.println(char_copy+" is not a palindrome");


}

}

