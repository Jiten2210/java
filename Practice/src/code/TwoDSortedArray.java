package code;
public class TwoDSortedArray
{
	public static void main(String[] args)
	{
		int arr[][]={{10,20,30,40},{15,25,35,45},{27,28,37,48},{32,34,39,51}};
		int low=0;
		int high=3;
		int key=39;
		while(low<4 && high>=0)
		{
			if(arr[low][high]==key)
			{
				System.out.println("found "+key+" at position ["+low+"]["+high+"]");
				break;
			}
			else
			{
				if(key>arr[low][high])
				low++;
				else
				high--;
			}
		}
	}
}