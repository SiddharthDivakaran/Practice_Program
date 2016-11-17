import java.util.HashMap;

public class ArraySumTest 
{
	public static void main(String[] args) 
	{
		int a[]={1,0,2,3,5};
		int num=3;
		HashMap<Integer, Integer>h =new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.put(num-a[i], a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				System.out.println(a[i]+" "+h.get(a[i]));
			}
		}
		
	}

}
