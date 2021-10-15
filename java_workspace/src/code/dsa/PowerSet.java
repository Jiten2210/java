package code.dsa;
public class PowerSet
{
	public static void main(String[] args)
	{
		char []arr={'k','i','r'};
		PowerSet p=new PowerSet();
		p.powerset(arr,arr.length);
	}
	public void powerset(char arr[],int setSize)
	{
		int power_set_size=(int)Math.pow(2,setSize);
		for(int count=0;count<power_set_size;count++)
		{
			for(int i=0;i<setSize;i++)
			{
				if((count & (1<<i))==0)
				System.out.print(arr[i]);
			}
			System.out.println("\n");
		}
	}
}