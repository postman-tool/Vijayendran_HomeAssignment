package intersection;

public class FindIntersectionValue {
	
	public static void main(String []args)
	{
		int [] value1 = {2,4,6,8,10};
		int [] value2 = {2,4,7,9,11};
		for(int i=0;i<value1.length;i++)
		{
			for(int j=0;j<value2.length;j++)
			{
				if(value1[i]==value2[j])
				{
					System.out.println("The intersected number is :"+value1[j]);
				}
			}
		}
	}

}
