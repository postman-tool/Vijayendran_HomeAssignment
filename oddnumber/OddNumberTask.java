package oddnumber;

public class OddNumberTask {
	
	public static void main(String []args)
	{
		int max = 10;
		for(int i=0;i<=max;i++)
		{
			if(i%2==1)
			{
				System.out.println("The Odd numbers are :"+ i);
			}
			else
			{
				System.out.println("The Even numbers :" + i);
			}
		}
	}

}
