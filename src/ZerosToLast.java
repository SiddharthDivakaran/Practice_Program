
public class ZerosToLast 
{
	public static void main(String[] args)
	{
		int a[]={0,2,3,3,1,0,2,1,0};
		int z=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				z++;
			}
			if(a[i]!=0)
			{
				a[j]=a[i];
				j++;
			}
		}
		
		for(int k=0;k<z;k++)
		{
			a[j]=0;
			j++;
		}
		
		for(int l=0;l<a.length;l++)
		{
			System.out.print(a[l]+" ");
		}
	}

}
