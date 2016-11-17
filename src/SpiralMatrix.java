
public class SpiralMatrix 
{
	public static void main(String[] args)
	{
		int val = 1;
		int n = 3;
		
		int a[][]=new int[n][n];
	    
		int c1=0;
		int c2=n-1;
		int r1=0;
		int r2=n-1;
		
		while(val<=n*n)
		{
			for(int i=c1;i<=c2;i++)
            {
                a[r1][i]=val++;
            }

            for(int j=r1+1;j<=r2;j++)
            {
                a[j][c2]=val++;
            }

            for(int i=c2-1;i>=c1;i--)
            {
                a[r2][i]=val++;
            }

            for(int j=r2-1;j>=r1+1;j--)
            {
                a[j][c1]=val++;
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
