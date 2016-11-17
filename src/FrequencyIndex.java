import java.util.TreeMap;

public class FrequencyIndex 
{
	public static void main(String[] args)
	{
		
		int a[] = {1,2,3,2,2,3,3,4,5,3,6,7,8,2};
		TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(t.containsKey(a[i]))
             {
            	 t.put(a[i], t.get(a[i])+1);
             }
			else
			{
				t.put(a[i],1);
			}
		}
		int m=0;
		for(Integer i:t.keySet())
		{
			if(t.get(i)>1)
			{
				m=i;
				break;
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==m)
			{
				System.out.println(a[j]+"  "+j);
				break;
			}
		}
	}

}
