package code.dsa;
public class MagicIndex
{
	public static void main(String[] args)
	{
		int arr[]={-5,-2,-1,0,2,5,8};
		int i=0;
		int j=arr.length;
		int mid=(i+j)/2;
		while(i<j)
		{
			mid=(i+j)/2;
			if(arr[mid]==mid)
			{
				System.out.println("magic index is :"+mid);
				break;
			}
			else if(arr[mid]<mid)
			{
				i=mid;
			}
			else if(arr[mid]>mid)
			{
				j=mid;
			}
		}
	}
}