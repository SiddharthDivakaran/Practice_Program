
public class FactCheck 
{
	public static void main(String[] args) 
	{
		int n=100;
		int f=0;
		for(int i=5;n/i>0;i*=5)
		{
			f+=n/i;
		}
		System.out.println(f);
		
	}

}
