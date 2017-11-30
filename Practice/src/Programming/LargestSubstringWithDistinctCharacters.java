package Programming;
import java.util.*;
public class LargestSubstringWithDistinctCharacters {

    public static void main(String[] args)
    {
		String str="kireet";
		int len=str.length();
		int prev=0;
		HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
		for(int i=0;i<len-1;i++)
		{
			if(!hs.containsKey(str.charAt(i)))
			{
				hs.put(str.charAt(i),i);
			}

			else
			{
				prev=prev>hs.size()?prev:hs.size();
				i=hs.get(str.charAt(i));
				hs.clear();
			}
		}
		System.out.println(prev);

    }
}