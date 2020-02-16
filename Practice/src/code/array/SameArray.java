package code.array;
public class SameArray
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,5,5};
		int arr1[]={5,5,5,4,3,2,1};
		int xor=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			xor=xor ^ arr[i];
		}
		for(int i=0;i<arr1.length;i++)
		{
			xor=xor ^ arr1[i];
		}
		if(xor==0)
		{
			System.out.println("arrays are same");
		}

		else
		System.out.println("arrays are different");

	}
}