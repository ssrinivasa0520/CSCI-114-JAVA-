class PrimeGenerator
{
	public void nextPrime(int prime)
	{
		for(int i=2;i<=prime;i++)
		{
			if(isPrime(i))
				System.out.print(i+", ");
		}
	}
	public static boolean isPrime(int n)
	{
		for (int i=2;i<n;i++)
			if (n%i==0)
			{
				return false;
			}
			return true;
	}
}