package Programming;
public class SecondMaximum
{
	public static void main(String[] args)
	{
		int arr[]={3,4,1,7,19,4,10,18,12};
		int max1,max;
		if(arr[0]>arr[1])
		{
			max=arr[0];
			max1=arr[1];
		}
		else
		{
			max=arr[1];
			max1=arr[0];
		}
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max1=max;
				max=arr[i];
			}
			if(arr[i]>max1 && arr[i]<max)
			{
				max1=arr[i];
			}
		}

		System.out.println("Second largest elemnt : "+max1);

	}
}