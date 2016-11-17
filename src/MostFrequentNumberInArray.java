import java.util.HashMap;

public class MostFrequentNumberInArray
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,2,3,4,2,5,2,4,2,4,4,4,4};
		
		HashMap<Integer, Integer>h = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i], h.get(a[i])+1);
			}
			else
			{
				h.put(a[i],1);
			}
		}
		int max=-999;
		int num=0;
		for(Integer i:h.keySet())
		{
			if(max<h.get(i))
			{
				max=h.get(i);
				num=i;
			}
			
		}
		System.out.println("number: "+num+"  occurence: "+max);
	}

}
