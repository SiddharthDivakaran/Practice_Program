import java.util.HashMap;

public class MaxOccurence 
{
	public static void main(String[] args)
	{
		String st = "HELHHLLO WORLD";
		HashMap<Character, Integer>h= new HashMap<Character, Integer>();
		int max=-999;
		for(int i=0;i<st.length();i++)
		{
			if(h.containsKey(st.charAt(i)))
			{
				h.put(st.charAt(i), h.get(st.charAt(i))+1);
				
			}
			else
			{
				h.put(st.charAt(i),1);
			}
			
		}
		Character c ='x';
		for(Character ch:h.keySet())
		{
			System.out.println(ch+"  "+h.get(ch));
			if(max<h.get(ch))
			{
				max=h.get(ch);
				c = ch;
				
			}
		
		}
		System.out.println("max: "+max+"  "+c);
	}

}
