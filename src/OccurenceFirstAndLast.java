
public class OccurenceFirstAndLast
{
	public static void main(String[] args) 
	{
		int a[] = {1,1,1,1,1,1,1,1};
		int first=0;
		int last=0;
		int count=0;
		
		int n=1;
		
		
		for(int i=0;i<a.length;i++)
		{
			if((a[i]==n)&&(count==0))
			{
				first=i;
				count++;
			}
			else if(a[i]==n&&count>0)
			{
				last=i;
				count++;
			}
		}
		
		if(first==last)
		{
			System.out.println("first and last occurence is same: "+first);
		}
		else
		{
			System.out.println("first occurence of element: "+n+":  "+first+"   last occurence: "+last);
		}
		
	}

}
