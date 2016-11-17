import java.util.HashMap;

public class DuplicateCount 
{
	public static void main(String[] args) 
	{
		String str = "abbaccdbac";
		HashMap<Character, Integer>h= new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			if(h.containsKey(str.charAt(i)))
			{
				h.put(str.charAt(i), h.get(str.charAt(i))+1);
			}
			else
			{
				h.put(str.charAt(i),1);
			}
		}
		
		for(Character ch : h.keySet())
		{
			//if(h.get(ch)>1)
			//{
				System.out.print(ch+""+h.get(ch));
			//}
		}
	}

}
