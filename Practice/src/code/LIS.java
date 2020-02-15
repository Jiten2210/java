package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LIS
{
	public static void main(String[] args)
	{
		
		Map<String,List<String>> map = new TreeMap<>();
		List<String> s = new ArrayList<String>();
		s.add("1");
		map.put("alok",s);
		System.out.println(map);
		
		/*int[] arr={10,22,9,33,21,50,41,60 };
		int[] list=new int[arr.length];
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i] && list[i]<list[j]+1)
				list[i]=list[j]+1;
			}
		}
		for(int x:list)
		{
			System.out.println(x+1);
		}*/
	}

}