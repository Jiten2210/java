package code.array;
public class TrailingZeros
{
	public static void main(String[] args)
	{
		int n=10;
		int count=0;
		for(int i=1;((int)Math.pow(5,i))<=n;i++)
		{
			count=count+n/(int)Math.pow(5,i);
		}
		System.out.println("Number of trailing zeros : "+count);
	}
}