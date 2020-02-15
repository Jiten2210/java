package code;
public class BaseAdd
{
	public static void main(String[] args)
	{
		String a="73c";
		String b="79c";
		Integer i1=Integer.valueOf(a,13);
		Integer i2=Integer.valueOf(b,13);
		//String s=Integer.toString(a,13);

		Integer result=i1+i2;
		String re=Integer.toString(result,2);

		System.out.println(re);
	}
}