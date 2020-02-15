package code;
public class Anagram
{
	public static void main(String[] args)
	{
		String str="Jiten";
		System.out.println("Original String is: "+str+": and permutations are: ");
    	permutation("", str);
	}

	private static void permutation(String prefix, String str)
	{
    	int n = str.length();
    	if (n == 0)
    	System.out.println(prefix);
    	else
   			{
        	for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
   			 }
  	}
}
