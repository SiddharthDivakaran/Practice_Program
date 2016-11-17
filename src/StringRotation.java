
public class StringRotation
{
	public static void main(String[] args)
	{
//		String st1 = "amazon";
//		String st2 = "azonam";
		
		String st1 = "quality";
		String st2 = "lityqua";
		
		char ch[] = st1.toCharArray();
		
		int rotation_number=0;
		while(rotation_number!=2)
		{
		for(int i=0;i<ch.length-1;i++)
		{
			
				char temp=' ';
				temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
		
			
		}
		rotation_number++;
		}
		String st = new String(ch);
		System.out.println(st);
		
		if(st.equals(st2))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
