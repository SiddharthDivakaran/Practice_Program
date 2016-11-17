
public class PositveSequence 
{
	public static void main(String[] args)
	{
		int a[] = {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,6,3,4,5,9,6,7};
		int count = 0;
		int pcount = 0;
		int right = 0;
		int left = -1;
		int low=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				
				count++;
				
			}
			
			if(count>pcount)
			{
				pcount=count;
				
				left = right;
			}
			if(a[i]<0)
			{
				count=0;
				right = i;
			}
			
		}
		System.out.println(pcount+"  "+left);
		
	}

}
