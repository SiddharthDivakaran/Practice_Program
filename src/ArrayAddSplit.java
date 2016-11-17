
public class ArrayAddSplit 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
		int b[] = {2,3,4,5,6,7,8};
		
		
		int l = a.length>b.length?a.length:b.length;
		int minlen = a.length<b.length?a.length:b.length;
		int su = 0;
		int count = 0;
		for(int i=0;i<minlen;i++)
		{
			su = a[i]+b[i];
			if(su>=10)
			{
				count++;
			}
		}
		
		int pos = l+count;
		
		int c[] = new int[pos];
		
		int sum=0;
		int j=0;
		for(int i=0;i<minlen;i++)
		{
			sum = a[i]+b[i];
			if(sum<10)
			{
				c[j]=sum;
				
			}
			else
			{
				int x = sum/10;
				int y = sum%10;
				c[j]=x;
				c[j+1]=y;
				//System.out.println(sum+" "+"x: "+x+"  y: "+y);
				j++;
			}
			
			j++;
		}
		c[j]=b[b.length-1];
        for(int k=0;k<c.length;k++)
        {
        	System.out.print(c[k]+",");
        }
		
		
	}

}
