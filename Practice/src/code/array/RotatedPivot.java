package code.array;
public class RotatedPivot
{
	public static void main(String[] args)
	{
		int arr[]={5,1,2,3,4};
		int length=arr.length;
		int low=0;
		int mid=0;
		int i=0;
		int pivot;
		int j=length-1;
		while(i<=j)
		{
			mid= i+(j-i)/2;
			if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid])
			{
				System.out.println(arr[mid]);
				pivot=mid;
				break;
			}
			else if(arr[mid+1]>arr[mid] && arr[mid-1]<arr[mid])
			{
				i=mid+1;
			}

			else if(arr[mid-1]>arr[mid] && arr[mid+1]<arr[mid])
			{
				j=mid-1;
			}

			else
			System.out.println(arr[mid]);
			//System.out.println(arr[0]);
		}

	}
}