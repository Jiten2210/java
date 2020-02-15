package code;
public class ArrayRotate
{
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5,6,7,8};
		int d=5;
		int j=arr.length-1;
		int []tmp=new int[d];
		for(int k=0;k<d;k++)
		tmp[k]=arr[k];

		for(int i=d;i<=j;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=j-(d-1),l=0;i<=j;i++,l++)
		{
			arr[i]=tmp[l];
		}
		for(int n:arr)
		{
			System.err.println(n);
		}

	}
}