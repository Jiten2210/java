package Programming;
import java.util.*;
public class ClosestToZero
{
	public static void main(String[] args)
	{
		int arr[]={1,60,-10,70,-80,85};
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;
		System.out.println("Min : "+min+" Max : "+max);
		Arrays.sort(arr);
		for(int n: arr)
		System.out.print(" "+n+" ");
		int i=0;
		int j=arr.length-1;
		for(i=0;i<j;)
		{
			int temp=arr[i]+arr[j];
			if(temp>0)
			{
				if(temp<max)
				{
					max=temp;
				}
				j--;
			}

			else if(temp<0)
			{
				if(temp>min)
				{
					min=temp;

				}
				i++;
			}

			else
			{
				max=0;
				System.out.println("\n"+temp);
				break;
			}
		}
		int closest= max>Math.abs(min)?min:max;
		System.out.println("\nclosest to zero sum ="+closest);

	}
}