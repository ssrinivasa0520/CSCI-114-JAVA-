import java.util.Scanner;

public class Main4
{
   public static void main(String[] args) {
  
   //Scanner object to get input from user
   Scanner scan = new Scanner(System.in);
      
       //string array to store five words enterd by user
       String[] words = new String[5];
      
       //string to store palindrome and non-palindrome words
       String palin = "";
   String not_palin = "";
      
       //Create Object of palindrome class
       Palindrome palindrome = new Palindrome();
      
      
       //ask user five words
       System.out.println("Enter the 5 words: ");
       for(int i=0; i<5; i++)
       {
       words[i] = scan.next();
       }
      
         
       for(int i=0; i<5; i++)
       {
       if(palindrome.is_Palindrome(words[i]) )
       {
       if(palin == "")
       {
       palin += words[i] + " ";
       }
       else
       {
       palin += ", " + words[i] + " ";
       }
      
       }
       else
       {
       if(not_palin == "")
       {
       not_palin += words[i] + " ";
       }
      
       else
       {
       not_palin += ", " + words[i] + " ";
       }
       }
      
      
       }
      
       //print the result;
       System.out.println("Result: ");
       System.out.println("Palindrome: " + palin);
       System.out.println("Not Palindrome: "+ not_palin);
      
      
   }
}