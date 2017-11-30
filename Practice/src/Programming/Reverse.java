package Programming;
import java.util.*;
public class Reverse
{
	public static void main(String[] args)
	{
		int[] arr={-1, 0, 0, 1, 1};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int n:arr)
		hs.add(n);

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(hs);
		Collections.sort(al);

		for(int i=al.size()-1;i>=0;i--)
		{
			int element=al.get(i);
			//System.out.println(element);
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==element)
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}