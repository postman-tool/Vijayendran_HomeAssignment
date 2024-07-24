package duplicateNumber;

import java.util.Arrays;

public class TestDuplicateNumber {
	
	public static void main(String []args)
	{
		int [] value = {1,3,5,7,9,9,5,3};
		Arrays.sort(value);
		for(int i=0;i<value.length-1;i++)
		{
			if(value[i]==value[i+1]) {
				System.out.println("These are the duplicate numbers :"+ value[i+1]);
			}
			
		}
		
	}

}
