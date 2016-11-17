import java.util.HashMap;
import java.util.TreeMap;

public class ArrayElementRepeat 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,4,5,5,5,6,7,7};
		TreeMap<Integer,Integer> h = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			if(h.containsKey(ar[i]))
			{
				h.put(ar[i], h.get(ar[i])+1);
			}
			else
			{
				h.put(ar[i],1);
			}
		}
		
		for(Integer i: h.keySet())
		{
			if(h.get(i)>1)
			{
				System.out.println(i+" is repeated "+h.get(i)+" times");
			}
		}
	}

}
