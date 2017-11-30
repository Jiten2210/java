package Programming;
public class UnSorted
{
	public static void main(String[] args)
	{
		int arr[]={10,12,20,30,25,40,32,31,35,50,60};
		int left;
		int right,s=0;
		int left1;
		int right1;
		for(left=0;left<arr.length;left++)
		{
			if(arr[left+1]<arr[left])
			{
				System.out.println(arr[left]);
				break;
			}
		}

		for(right=arr.length-1;right>=0;right--)
		{
			if(arr[right-1]>arr[right])
			{
				System.out.println(arr[right]);
				break;
			}
		}
		int min=arr[left];
		int max=arr[right];
		System.out.println(left+" "+right);
		for(int i=left;i<=right;i++)
		{
			if(arr[i]>max)
			max=arr[i];

			if(arr[i]<min)
			min=arr[i];
		}
		for(left1=0;left1<left;left1++)
		{
			if(left1>min)
			{
				left=left1;
				break;
			}
		}

		for(right1=right+1;right1<arr.length;right1++)
		{
			if(right1<min)
			{
				right=right1;
				break;
			}
		}
		System.out.println(min+" "+max);
		System.out.println(left+" "+right);
	}
}