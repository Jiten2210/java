package code;
public class MajorityElement
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,3,3,1,3,3,1};
		int count=1;
		int majority_ind=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
			{
				majority_ind=i;
				count=1;
			}

			if(arr[i]==arr[majority_ind])
			count++;

			else
			{
				count--;
			}

		}

		System.out.println(arr[majority_ind]);
	}
}