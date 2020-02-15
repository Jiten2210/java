package code;
import java.util.*;
public class PowerOfThree
{
	public static void main(String[] args)
	{
		int arr[]={2,5,6,7,8,45,12};
		int arr1[]={4,5,8,12,11};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int n:arr)
		hm.put(n,1);

		for(int i=0;i<arr1.length;i++)
		{
			if(hm.containsKey(arr1[i]))
			System.out.println(arr1[i]);
		}
	}
}
