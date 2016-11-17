import java.util.HashMap;

public class Frequency_of_word {
	
	public void frequency(String str,char c)
	{
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> h= new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(h.containsKey(ch[i]))
			{
				h.put(ch[i], h.get(ch[i])+1);
			}
			else
			{
				h.put(ch[i],1);
			}
		}
		if(h.get(c)==null)
		{
			System.out.println("String does not contains character: "+c);
		}
		else
		{
		System.out.println(h.get(c));
		}
	}
	
	public static void main(String[] args) {
		String str = "apple";
		Frequency_of_word w = new Frequency_of_word();
		w.frequency(str, ' ');
	}

}
