package code;
public class CoinDenomination
{
	public static void main(String[] args)
	{
		int[] s={1,2,3,4};
		int n=5;
		int m=s.length;
		int result = coinLol(s,m,n);
		System.out.println("Total Ways : "+result);
	}

	public static int coinLol(int[] s,int m,int n)
	{
		if(n==0)
		return 1;

		if(n<0)
		return 0;

		if(n>=1 && m<=0)
		return 0;

		return coinLol(s,m-1,n)+coinLol(s,m,n-s[m-1]);
	}
}