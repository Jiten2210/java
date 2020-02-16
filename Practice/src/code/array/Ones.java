package code.array;
public class Ones
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,1,2};
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			a=a^arr[i];
		}
		System.out.println(a);
	}
}