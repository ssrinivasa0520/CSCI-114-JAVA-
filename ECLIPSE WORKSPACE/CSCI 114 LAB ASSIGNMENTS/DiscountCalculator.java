import java.util.Scanner;
import java.lang.Math;
public class DiscountCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the number of movie rentals: "); //print statement
        int numRentals = scan.nextInt(); //getting user's input on the number of rentals
        System.out.println("Enter the number of members referred to the video club: "); //print statement
        int numReferrals = scan.nextInt(); //getting user's input of the number of referrals
        float discount = Math.min(numRentals+numReferrals, 75); //calculating discount
        System.out.println("The discount is equal to: "+ discount +" percent.");
        
    }
}