
public class Reverse
{
	public static void main(String[] args)
	{
		String str = "This is sample";
		String[]st=str.split(" ");
		StringBuilder sb = new StringBuilder(); 
		for(int i=st.length-1;i>=0;i--)
		{
			sb.append(st[i]);
			sb.append(" ");
		}
		System.out.println(sb);
		
	}

}
