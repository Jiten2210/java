package code.array;
public class Rotation
{
	public static void main(String[] args)
	{
		String s1=args[0];
		String s2=args[1];
		Rotation r=new Rotation();
		r.isSubString(s1,s2);
	}
	public void isSubString(String s1,String s2)
	{
		try
		{
			//System.out.println(s1);
			int l1=s1.length();
			if(l1!=s2.length())
			{
				System.out.println("Not A Rotation");
				return;
			}
			char c=s1.charAt(0);
			int ind=s2.indexOf(c);
			//System.out.println(ind);
			boolean flag=true;
			for(int j=0,k=0;j<l1;j++)
			{
				if(ind<l1 && s1.charAt(j)==(s2.charAt(ind)))
				{
						ind++;
						continue;

				}
				else if(s1.charAt(j)==s2.charAt(k))
				{
					k++;
					continue;
				}
				else
				{
					System.out.println("not a rotation!!!");
					flag=false;
					break;
				}


			}
			if(flag)
			System.out.println("Yippi SUCCESS!!!");
		}
		catch(Exception e)
		{
			System.out.println("not a rotation!!!");
		}


	}
}
