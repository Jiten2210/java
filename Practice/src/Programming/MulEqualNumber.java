package Programming;
public class MulEqualNumber
{
	public static void main(String[] args)
	{
		int number=28;


		for(int num=10;num>=9;num++)
		{
			int count=1;
			for(int j=num;j>1;j=j/10)
			{
				count=count*(j%10);
			}
			//System.out.println(count);


			if(count==number)
			{
				System.out.println(num);
				break;
			}
		}
	}
}