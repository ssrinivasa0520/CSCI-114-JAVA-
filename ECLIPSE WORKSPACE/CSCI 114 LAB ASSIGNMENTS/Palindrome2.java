import java.util.*;

public class Palindrome2 {

public static void main(String args[])

{

Scanner in=new Scanner(System.in);

String str;

String str_reverse = "";

System.out.println("Enter a word:");
str=in.nextLine();

int length=str.length();

for (int i=length-1;i>=0;i--)

{

str_reverse=str_reverse+str.charAt(i);

}

if (str.equals(str_reverse))

System.out.println("Word is Palindrome");

else

System.out.println("Word is not Palindrome");


}

}