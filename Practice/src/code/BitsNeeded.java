package code;
public class BitsNeeded
{
	public static void main(String[] args)
	{
		int a=7;
		int b=8;
		int c=a^b;
		int count=0;
		for(int i=0;i<32;i++)
		{
			if((c & (1<<i))==0)
			count++;
		}
		System.out.println(32-count);
	}
}