package Programming;
import java.util.*;
public class MaxOccurrence
{
	public static void main(String[] args)
	{
		int[] arr={2,2,2,1,1,1,1,1,3,4,5,6,2,2,2};
		//Arrays.sort(arr);
		int maxCount=0;
		for(int a=0;a<arr.length;a++)
		{
			int count=1;
			for(int b=a+1;b<arr.length;b++)
			{
				if(arr[a]==arr[b])
				{
					count++;
				}
			}
			if(count>maxCount)
			maxCount=count;
		}
		System.out.println(maxCount);
	}
}
