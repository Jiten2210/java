package code;
public class MissingNumber
{
	public static void main(String[] args)
	{
		int n=13;
		int[] arr={1,2,3,5,6,7,8,9,10,11,12,13};
		int sum1=n*(n+1)/2;
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}

		System.out.println("Missing Number : "+ (sum1-sum));
	}
}