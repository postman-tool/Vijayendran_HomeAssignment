package primeNumber;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n = 58;
	int count = 0;
	
	for(int i=1;i<=n;i++)
	{
		if(n%i == 0)
		{
			count++;
		}
	}
		if(count == 2)
		{
			System.out.println("The given number "+ n + " is prime number");
		}
		else
		{
			System.out.println("The given number "+ n +" is not prime number");
		}
	}
}	
