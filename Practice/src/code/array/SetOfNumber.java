package code.array;
import java.util.*;
public class SetOfNumber
{
	public static void main(String[] args)
	{
		String str="534976";
		char[] digit=str.toCharArray();
		int n=digit.length;
		int i,j;
		int smallest;
		for(i=n-1;i>0;i--)
		{
			if(digit[i]>digit[i-1])
			break;
		}
		//System.out.println(i);
		if(i==0)
		{
			System.out.println("not possible");
		}
		else
		{
			int x=digit[i-1];
			smallest=i;
			for(j=i+1;j<n;j++)
			{
				if(digit[j]>x && digit[j]<digit[smallest])
				smallest=j;
			}
			//System.out.println(i);
			char temp=digit[i-1];
			digit[i-1]=digit[smallest];
			digit[smallest]=temp;



			ArrayList<Character> al=new ArrayList<Character>();
			for(int k=i;k<n;k++)
			{
				al.add(digit[k]);
			}
			Collections.sort(al);
			//System.out.println(al);
			for(int l=0;l<al.size();l++)
			{
				digit[i]=al.get(l);
				i++;
			}

			for(char c:digit)
			System.out.print(c);
			System.out.println();

		}


	}
}
