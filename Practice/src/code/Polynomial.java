package code;
public class Polynomial
{
	public static void main(String[] args)
	{
		int arr[]= {2, -6, 2, -1};
		int x=3;
		int pow=arr.length-1;
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			ans+= arr[i]*Math.pow(x,pow);
			pow--;
		}
		System.out.println(ans);
	}
}