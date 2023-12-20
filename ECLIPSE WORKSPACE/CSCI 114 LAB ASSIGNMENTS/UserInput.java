import java.util.*;  

class UserInput {
	
 int getNextNumber()
 {
  Scanner sc= new Scanner(System.in); 
  System.out.println("Enter -1 to terminate"); //User directions
  System.out.println("Enter Number:");
  int num= sc.nextInt();  //accepting user input
  return num;
 }

}