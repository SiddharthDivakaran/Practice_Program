
public class SpiralArray2 
{
	public static void main(String[] args)
	{
		int n=3;
		int a[][]=new int[n][n];
		int c1=0;
		int c2=n-1;
		int r1=0;
		int r2=n-1;
		int k=1;
		while(k<=n*n)
		{
			for(int i=c1;i<=c2;i++)
			{
				a[r1][i]=k++;
				
			}
			for(int j=r1+1;j<=r2;j++)
			{
				a[j][c2]=k++;
				
			}
			for(int ii=c2-1;ii>=c1;ii--)
			{
				a[r2][ii]=k++;
			
			}
			for(int jj=r2-1;jj>=r1+1;jj--)
			{
				a[jj][c1]=k++;
				
			}
			c1++;
			c2--;
			r1++;
			r2--;
			
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
