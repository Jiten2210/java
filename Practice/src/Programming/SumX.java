package Programming;
import java.util.*;
public class SumX
{
	public static void main(String[] args)
	{
		int arr[]={2,3,5,1,4,6,7,9};
		Hashtable h=new Hashtable();
		int sum=10;
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(sum-arr[i]))
			System.out.println(arr[i]+" "+ (sum-arr[i]));

			else
			h.put(arr[i],1);

		}
	}
}