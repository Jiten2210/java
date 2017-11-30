package Programming;
public class ZeroOnes
{
	public static void main(String[] args)
	{
		int arr[]={0,0,0,0,1,1,1,0,0,1,0,1,1,1,1,1,0,0,0,1,1,0,0,0,0,0,0};
		for(int i=0,j=1;(i<arr.length&&j<arr.length);)
		{
			if(arr[i]!=0 && arr[j]!=1)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

			if(arr[i]!=0 && arr[j]==1)
			{
				j=j+2;
			}

			else if(arr[i]==0 && arr[j]!=1)
			{
				i=i+2;
			}
			else
			{
				i=i+2;
				j=j+2;
			}


		}

		for(int n:arr)
		System.out.print(n);
	}


}
