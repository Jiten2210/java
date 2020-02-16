package code.array;
public class NonRepeatingElement
{
	public static void main(String[] args)
	{
		int arr[]={1,2,1,3,3};
		int xor=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			xor=xor ^ arr[i];
		}
		System.out.println(xor);

	}
}