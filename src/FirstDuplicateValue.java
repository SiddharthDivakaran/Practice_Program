import java.util.HashMap;
import java.util.TreeMap;

public class FirstDuplicateValue 
{
	public static void main(String[] args)
	{
		int a[]={4,3,1,2,5,9,5,4};
		HashMap<Integer, Integer>t = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(t.containsKey(a[i]))
			{
				t.put(a[i],t.get(a[i])+1);
			}
			else
			{
				t.put(a[i],1);
			}
			
		}
		int count=0;
		int first=0;
		int c=0;
		for(Integer j:t.keySet())
		{
		  if(t.get(j)>1)
		  {
		    for(int i=0;i<a.length;i++)
		    {
			  if(j==a[i])
			  {
				count=i;  
				//System.out.print(i+"\t");
				c++;
			  }
			  if(c==1)
			  {
				  first=i;
			  }
		    }
		     System.out.println(first+"   "+count);
		  break;
		   }
		}
	}

}
