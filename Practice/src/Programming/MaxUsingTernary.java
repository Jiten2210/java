package Programming;
public class MaxUsingTernary
{
	public static void main(String[] args)
	{
		int a=16;
		int b=8;
		int c=9;

		int x= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greater number is:"+x);
	}
}