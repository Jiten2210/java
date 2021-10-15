package code.dsa;
public class LongestIncreasing
{
	public static void main(String[] args)
	{
		int arr[]={5,6,2,3,4,7,9,9,8,9,5};
		int length=arr.length;
		int max=0;
		int list[]=new int[length];
		for(int i=0;i<length;i++)
		list[i]=1;

		for(int i=0;i<length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && list[i]<list[j]+1)
				list[i]=list[j]+1;
			}
		}
		for(int i=0;i<length;i++)
		{
			if(list[i]>max)
			max=list[i];

		}
		System.out.println("Length of longest increasing subsequence:  "+max);

	}
}