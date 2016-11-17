import java.util.HashMap;

public class MIssingElementInArray 
{
  public static void main(String[] args)
  {
	int a1[] = {1,2,3,4,5,6,7};
	int a2[] = {1,3,4,5,6,7};
	int l=0;
	HashMap<Integer, Integer>h= new HashMap<Integer, Integer>();
    int miss=0; 
	if(a1.length>a2.length)
	{
	 for(int i=0;i<a1.length;i++)
	 {
		 h.put(a1[i],1);
	 }
	 
	 
	 for(int j=0;j<a2.length;j++)
	 {
		 if(!h.containsKey(a2[j]))
		 {
			 miss = a2[j];
			 System.out.println(miss);
		 }
	 }
	 
	}
	if(a2.length>a1.length)
	{
		for(int i=0;i<a2.length;i++)
		{
			h.put(a2[i],1);
		}
		
		 
		 for(int j=0;j<a1.length;j++)
		 {
			 if(!h.containsKey(a1[j]))
			 {
				 miss = a1[j];
				 System.out.println(miss);
			 }
		 }
	}
	
	System.out.println(miss);
	
  }
}
