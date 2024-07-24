package fibonacci;

public class FibonacciTask {
	
	public static void main(String []args)
	{
		int first=0, second = 1, third, total=10;
		for(int i=0;i<total;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
	}

}
