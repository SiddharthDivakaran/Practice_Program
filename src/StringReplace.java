
public class StringReplace
{
	public void replace(String str1,String str2,char c)
	{
		String st[] = str1.split("");
		String ss="";
		String cc = String.valueOf(c);
		for(int i=0;i<st.length;i++)
		{
			if(!st[i].equals(cc))
			{
			 ss = ss+st[i];
			}
			if(st[i].equals(cc))
			{
				ss=ss+str2;
			}
			
		}
		
		System.out.println(ss);
		
		
	}
	
	public static void main(String[] args)
	{
		String str1 ="apple";
		String str2 = "sot";
		char c ='p';
		
		StringReplace sr = new StringReplace();
		sr.replace(str1, str2, c);
		
	}

}
