import java.util.HashMap;

public class NUmberPalindrome
{
	public static void main(String[] args)
	{
		int n =10201;
		HashMap<Integer, Integer>h = new HashMap<Integer,Integer>();
		
		while(n!=0)
		{
			int x = n%10;
			n=n/10;
			if(h.containsKey(x))
			{
				h.put(x, h.get(x)+1);
			}
			else
			{
				h.put(x, 1);
			}
			
			
		}
		int count=0;
		int freq=0;
		String st="";
		for(Integer i:h.keySet())
		{
			if(h.get(i)==1)
			{
				count++;
			}
			if(h.get(i)>1)
			{
				freq++;
				st = st+String.valueOf(i);
			}
		}
		if(count>1)
		{
			
			System.out.println("not a palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
		
		System.out.println(st);
	}

}
