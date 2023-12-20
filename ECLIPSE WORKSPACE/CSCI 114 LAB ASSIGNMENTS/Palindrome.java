import java.util.Scanner;

class Palindrome
{
  
//this method returns true if the given parameter is palindrome
public boolean is_Palindrome(String str)
{
StringBuilder input_str = new StringBuilder();
input_str.append(str);
  
//now reverse the string
String result = input_str.reverse().toString();
  
//check if str and reverse string are same then return true otherwise return false
if( str.equals(result))
{
return true;
}
  
  
return false;
  
}
}
