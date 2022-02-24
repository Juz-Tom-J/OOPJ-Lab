import java.util.Scanner;

public class prog_pack_1_reverseofstring {

public static void main(String[] args) {

String character,reverse= "";
int len,i;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a word: ");
character=sc.nextLine();
len=character.length();

for(i=len-1;i>=0;i--)
reverse+=character.charAt(i);

  System.out.println("The reverse of the word entered: "+reverse);

}

}
