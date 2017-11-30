package Programming;
public class SubSetSum
{
	public static void main(String[] args)
	{
		int[] arr={3,34,0,12,5,2};
		int sum=9;
		boolean ans=subset(arr,sum,arr.length);
		if(ans)
		System.out.println("yea");
	}
	public static boolean subset(int[] arr,int sum,int n)
	{
		if(sum==0)
		return true;

		if(n==0&&sum!=0)
		return false;

		if(sum<arr[n-1])
		return subset(arr,sum,n-1);

		return subset(arr,sum,n-1)||subset(arr,sum-arr[n-1],n-1);
	}
}