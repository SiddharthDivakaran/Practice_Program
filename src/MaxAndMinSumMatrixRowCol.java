
public class MaxAndMinSumMatrixRowCol 
{
	public static void main(String[] args)
	{
		int a[][]={{3,-5,10},{6,2,-1},{2,6,1}};
		int rsum=0;
		int csum=0;
		int Rmax=-999;
		int Rmin=999;
		int Cmax=-999;
		int Cmin=999;
		int cmax=0;
		int cmin=0;
		int rmax=0;
		int rmin=0;
		int j=0;
		int cc=0;
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a.length;c++)
			{
			   rsum = rsum+a[r][c];
			   
			   csum = csum+a[c][r];
//              
//				if(Cmax<csum)
//				{
//					Cmax=csum;
//					cmax=c;
//				}
//				if(Cmin>csum)
//				{
//					Cmin=csum;
//					cmin=c;
//				}
			   cc=c;
			}
			
			System.out.println(cc);
			if(Rmax<rsum)
			{
				Rmax=rsum;
				rmax=r;
			}
			if(Rmin>rsum)
			{
				Rmin=rsum;
				rmin=r;
			}
			
			if(Cmax<csum)
			{
				Cmax=csum;
				cmax=cc;
			}
			if(Cmin>csum)
			{
				Cmin=csum;
				cmin=cc;
			}
			rsum=0;
			csum=0;
			
			
		}
		
		System.out.println("max sum: "+Rmax+" row: "+rmax);
		System.out.println("min sum: "+Rmin+" row: "+rmin );
		System.out.println();
		System.out.println("max sum: "+Cmax+" row: "+cmax);
		System.out.println("min sum: "+Cmin+" row: "+cmin );
	}

}
