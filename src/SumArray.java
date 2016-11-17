import java.util.HashMap;

public class SumArray 
{
	public static void main(String[] args)
	{
		int ar[]={1,3,4,5,8};
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		int N = 9;
		for(int i=0;i<ar.length;i++)
		{
			h.put(N-ar[i], ar[i]);
		}
		
		for(Integer k : h.keySet())
		{
			//System.out.print(k+" : "+h.get(k)+"  ");
		}
		
		for(int j=0;j<ar.length;j++)
		{
			if(h.containsKey(ar[j]))
			{
				System.out.println(ar[j]);
			}
			
		}
		
	}

}
