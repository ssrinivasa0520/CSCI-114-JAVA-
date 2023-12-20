import java.util.Scanner;

public class Palindrome4 {

public static void main(String args[])

{

Scanner in=new Scanner(System.in);
System.out.println ("Enter the number of words that you would like to check for:");
int n = Integer.valueOf(in.nextLine());

for (int j=1;j<=n;j++){
  

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

}