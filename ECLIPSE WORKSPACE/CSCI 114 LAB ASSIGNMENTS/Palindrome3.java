import java.util.*;

public class Palindrome3 {

    public static boolean isPalindrome(String word) {

        // convert all letters to uppercase to make the comparison case insensitive
        word = word.toUpperCase();
        int front = 0;
        int rear = word.length() - 1;
        while (front < rear) {
            if (word.charAt(front) != word.charAt(rear)) return false;
            front+=1;
            rear-=1;
        }
        return true;
    }

    public static void main(String[] args) {

        String[] words = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words separated by spaces: "); //accepting five words from user
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.next();
        }
        //Now, performing Palindrome check using loop
        System.out.print("\nPalindromes: ");
        for (int i = 0; i < words.length; i++) 
        {
            if (isPalindrome(words[i])) 
            	{
            	System.out.print(words[i] + " ");
            	}
        }


        System.out.print("\n\nNot Palindromes: ");
        for (int i = 0; i < words.length; i++) {
            if (!isPalindrome(words[i])) 
            {
            	System.out.print(words[i] + " ");
            }
        }
    }

}