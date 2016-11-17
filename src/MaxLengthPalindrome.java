import java.util.HashMap;

public class MaxLengthPalindrome
{
	public static void main(String[] args)
	{
		//String a = "aabcbcbdcc";
		String a = "aabbcee";
		HashMap<Character, Integer>h= new HashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++)
		{
			if(h.containsKey(a.charAt(i)))
			{
				h.put(a.charAt(i),h.get(a.charAt(i))+1);
			}
			else
			{
				h.put(a.charAt(i), 1);
			}
		}
		int sum = 0;
		int c=0;int d=0;
		for(Character ch:h.keySet())
		{
			System.out.println(ch + "  "+ h.get(ch));
			if(h.get(ch)%2==0)
			{
			  sum=sum+h.get(ch);	
			}
			if(h.get(ch)%2!=0)
			{
				d = d+h.get(ch);
				c++;
			}
			
		}
		if(c>1)
		{
			System.out.println("cannot make a palindrome");
		}
		else
		{
			sum=sum+(d-1);
			System.out.println("can make a palindrome, max length: "+sum);
		}
		
		
		
		
	}

}
