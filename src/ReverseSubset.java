
public class ReverseSubset 
{
	public static void main(String[] args)
	{
		int ar[] = {1,2,3,4,5,6,7,8,9};
		int n=3;
		
		for(int i=0;i<ar.length/2;i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+" ");
		}
		
	}

}
