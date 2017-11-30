package Programming;
public class RepeatingElements
{
	public static void main(String[] args)
	{
		int[] arr={1,2,4,4,3,3,5};
		int n=arr.length;
		int arr1[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr1[arr[i]]=arr1[arr[i]]+1;
		}
		for(int s=1;s<arr1.length;s++)
		System.out.println(s+" "+arr1[s]);

	}
}