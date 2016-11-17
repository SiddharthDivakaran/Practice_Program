
public class heap
{
	public static void main(String[] args)
	{
		int a[]={5,4,3,2,1};
		int l=0;
		int r=0;
		for(int i=0;i<a.length;i++)
		{
			l = 2*i;
			r = (2*i)+1;
			
			if(a[l]>a[r])
			{
				int temp = a[l];
				a[l]=a[r];
				a[r]=temp;
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	} 

}
