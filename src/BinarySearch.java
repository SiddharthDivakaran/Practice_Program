
public class BinarySearch 
{
	public static void main(String[] args)
	{
		int a[] ={1,2,3,4,5,6,7};
		int lo = 1;
		int hi = a.length;
		int val = 5;
		
		while(lo<=hi)
		{
			int mid = lo+((hi-lo)/2);
			
			if(a[mid]==val)
			{
				System.out.println(a[mid]+" postion: "+mid);
				break;
			}
			else if(a[mid]<val)
			{
				lo = mid+1;
			}
			else
			{
				hi = mid-1;
			}
			
		}
				
		
	}

}
