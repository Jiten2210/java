package code.array;
import java.util.*;
public class MaxOccurrenceSorting
{
	public static void main(String[] args)
	{
		int[] arr={1,1,1,1,1,3,4,5,6,2,2,2};
		Arrays.sort(arr);
		int maxCount=0;
		for(int a=0;a<arr.length-1;a++)
		{
			int count=1;

				if(arr[a]==arr[a+1])
				{
					count++;
				}
			if(count>maxCount)
			maxCount=count;
		}
		System.out.println(maxCount);
	}
}
