import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Max_length_to_make_palindrome {
	public static void main(String[] args) {
		String s= "naxnaswerqqq";
		HashMap<Character,Integer>h = new HashMap<Character,Integer>();
	
		char[]c = s.toCharArray();
		for(int i =0;i<c.length;i++)
		{
			if(h.containsKey(c[i]))
			{
				h.put(c[i], h.get(c[i])+1);
			}
			else
			{
				h.put(c[i], 1);
			}
		}
		int ss=0;
		for(Character ch:h.keySet())
		{
			
			//System.out.println(ch+" "+h.get(ch));
			if((h.get(ch)>1)&&(h.get(ch)%2==0))
			{
				System.out.println(ch+"  "+h.get(ch));
				ss=ss+h.get(ch);
			}
			if((h.get(ch)>1)&&(h.get(ch)%2!=0))
			{
				
			}
			
		}
	System.out.println(ss);;
	}

}
