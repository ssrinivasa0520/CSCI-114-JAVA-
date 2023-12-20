import java.util.*;
public class PrimePrinter
{
	public static void main (String args[])
	{
		PrimeGenerator obj = new PrimeGenerator();
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of prime numbers you want:");
		int prime = input.nextInt();
		obj.nextPrime(prime);
	}
}
