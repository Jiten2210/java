package code;
import java.util.*;
public class SubSet
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,9,1,3};
		int length=arr.length;
		int ans=5;
		int count1=0;
		int power_set=(int)Math.pow(2,length);
		for(int count=0;count<power_set;count++)
		{
			int sum=0;
			ArrayList<Integer> al=new ArrayList<Integer>();
			for(int i=0;i<length;i++)
			{
				if((count&(1<<i))==0)
				al.add(arr[i]);

			}
			for(int k=0;k<al.size();k++)
			{
				sum=sum+al.get(k);
			}
			if(sum==ans)
			count1++;

		}
		System.out.println(count1);
	}
}