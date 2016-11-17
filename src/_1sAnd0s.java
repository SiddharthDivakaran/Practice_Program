import java.util.Scanner;

public class _1sAnd0s 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  int c1 =0;
	  int c0=0;
	  while(true)
	  {
		  System.out.println("Enter number");
		  int num = sc.nextInt();
		  if(num==1)
		  {
			  c1++;
		  }
		  if(num==0)
		  {
			  c0++;
		  }
		  else
		  {
			  break;
		  }
		  for(int i=0;i<c0;i++)
		  {
			  System.out.print(" "+0);
		  }
		  for(int j=0;j<c1;j++)
		  {
			  System.out.print(" "+1);
		  }
		  System.out.println();
	  }
		
	}

}
