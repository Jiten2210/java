package code;
public class GCD
{
	public static void main(String[] args)
	{
		int m=20;
		int n=8;
		int r;
		if(n==0 || m==0)
		{
			System.out.println("error");
		}

		if(m<0 || n<0)
		{
			System.out.println("error1");
		}

		while(m!=0 || n!=0)
		{
			r=m%n;
			if(r==0)
			{
				System.out.println("GCD is :"+n);
				break;
			}
			else
			{
				m=n;
				n=r;
			}
		}
	}
}