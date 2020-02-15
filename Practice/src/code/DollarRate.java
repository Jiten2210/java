package code;
import java.util.*;
public class DollarRate
{
	public static void main(String[] args)
	{
		int arr[]={1,2,9,10,12};
		int rate[]={52,55,60,57,55};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//int last=arr[arr.length -1];
		for(int i=0;i<arr.length-1;i++)
		{
			int a1=arr[i];
			int a2=arr[i+1];
			for(int j=a1;j<a2;j++)
			{
				hm.put(j,rate[i]);
			}
		}
		hm.put(arr[arr.length-1],rate[rate.length-1]);
		int l=7;
		int u=13;
		int max=0;
		int count=0;
		HashMap<Integer,Integer> hm1=new HashMap<>();
		for(int i=l;i<u;i++)
		{
			int key=hm.get(i);
			if(hm1.containsKey(key))
			{
				hm1.put(key,hm1.get(key)+1);
			}
			else
			hm1.put(key,1);

		}
		for(Map.Entry<Integer,Integer> e:hm1.entrySet())
		{
			int key=e.getKey();
			int currentCount=hm1.get(key);
			if(currentCount>count)
			{
				count=currentCount;
				max=key;
			}
		}
		System.out.println(max);
	}
}