
public class Ten_Hundred_Thousand_places
{
	public static void main(String[] args) {
		
		int num = 193;
		int p = num;
		int l=0;
		int d = 1;
		while(num>0)
		{
			
			num=num/10;
			l++;
			d = (d*10);
			System.out.println(d);
		}
		System.out.println(l +"  "+d );
		int x = d/10;
		for(int i =0;i<l;i++)
		{
			System.out.println();
		}
		
	} 

}
