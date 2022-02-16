package Prog_Pack_1;

import java.util.Scanner;

public class prog_pack_1_frequency_of_character {

public static void main(String[] args) {

String word;
char letter;
int len,i,count=0;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the word: ");
word = sc.nextLine();

System.out.println("Enter the letter to search: ");
letter = sc.next().charAt(0);

len = word.length();

for(i=0;i<len-1;i++)
{
 if(word.charAt(i)==letter)
 count++;
}
        System.out.println(word+" has a frequency of "+count +letter);
}

}
