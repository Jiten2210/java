package code.array;
public class HelicallyMatrix
{
	public static void main(String[] args)
	{
		int [][]arr={{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16}};

		int i,k=0,l=0;
		int m=4,n=4;

		while(k<m && l<n)
		{
			for(i=l;i<n;i++)
			{
				System.out.print(" "+arr[k][i]+" ");
			}
			k++;

			for(i=k;i<m;i++)
			{
				System.out.print(" "+arr[i][n-1] +" ");

			}
			n--;

			for(i=n-1;i>=1;i--)
			{
				System.out.print(" "+arr[m-1][i]+" ");
			}
			m--;
			for(i=m-1;i>=k;i--)
			{
				System.out.print(" "+arr[i][l]+" ");
			}
			System.out.println("");

		}
	}
}