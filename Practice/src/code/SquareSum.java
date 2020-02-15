package code;
import java.util.*;
public class SquareSum
{
	public static void main(String[] args)
	{
		int arr[]={1,5,3,4,6};
		Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
		for(int n:arr)
		{
			if(ht.containsValue(n*n))
			ht.put(n,n*n);
		}



	}
}