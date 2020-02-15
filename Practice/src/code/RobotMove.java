package code;
public class RobotMove
{
	static int [][]grid;
	public static void main(String[] args)
	{
		int i=4,j=2;
		grid=new int[i+1][j+1];
		RobotMove sc=new RobotMove();
		int ways=sc.countWays(i,j,"");
		for(int k=0;k<i+1;k++)
		{
			for(int l=0;l<j+1;l++)
			{
				System.out.print(grid[k][l]+" ");
			}
			System.out.println();
		}
		System.out.println("Total number of ways are :"+ways);
	}
	public int countWays(int a,int b,String path)
	{
		path=path+a+" "+b+", ";
		if(grid[a][b]!=0)
		return grid[a][b];

		if(a==0 || b==0)
		{
			grid[a][b]=1;
			//System.out.println(path);
			return 1;
		}



		else
		{
			grid[a][b]=countWays(a-1,b,path)+countWays(a,b-1,path);
			return grid[a][b];
		}

	}
}