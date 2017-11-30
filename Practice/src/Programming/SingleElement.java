package Programming;
public class SingleElement
{
	public static void main(String[] args)
	{
		int result=0;
		int arr[]={2,3,2,2,3,3,4};
		for(int i=0;i<32;i++)
		{
			int x=1<<i;
			//System.out.println(x);
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				if((x & arr[j])!=0)
				sum++;
			}

			if((sum%3)!=0)
			result=result|x;
		}
		System.out.println(result);
	}


}
