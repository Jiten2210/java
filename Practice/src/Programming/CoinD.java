package Programming;
public class CoinD
{
	public static void main(String[] args)
	{
		int[] arr1={2, 5, 3, 6};
		int n=10;
		int cd=coinDeno(arr1,arr1.length,n);
		System.out.println("Lcs count is: "+cd);

	}
	public static int coinDeno(int arr[],int m,int n)
	{
		if(n==0)
		return 1;

		if(n<0)
		return 0;

		if(m<=0&& n>=1)
		return 0;

		else
		return coinDeno(arr,m-1,n)+coinDeno(arr,m,n-arr[m-1]);

	}

}