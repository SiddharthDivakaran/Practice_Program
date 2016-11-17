
public class Left_sum_right 
{
   public static void main(String[] args)
   {
	 int a[] = {1,1,-11,1,12};
	 int sum1 =0;
	 int sum2 =0;
	 if(a.length%2!=0)
	 {
		 int c = (a.length/2)-1;
		 
		 
		 for(int i=0;i<a.length;i++)
		 {
		   if(i<=c)
		   {
			   sum1 = sum1+a[i];
			   //System.out.println(a[i]);
		   }
		   else
		   {
			   sum2 = sum2+a[i];
			   //System.out.println(a[i]);
		   }
		 }
		 
			 
		 System.out.println();
		 System.out.println(sum1+"  "+sum2);
		 if(sum1==sum2)
		 {
			 System.out.println("equal");
		 }
		 else
		 {
			 System.out.println("not equal");
		 }
		 
	 }
	 else
	 {
       int c = (a.length/2);
		 
		 
		 for(int i=0;i<a.length;i++)
		 {
		   if(i<=c)
		   {
			   sum1 = sum1+a[i];
			   //System.out.println(a[i]);
		   }
		   else
		   {
			   sum2 = sum2+a[i];
			   //System.out.println(a[i]);
		   }
		 }
		 
			 
		 System.out.println();
		 System.out.println(sum1+"  "+sum2);
	 }
	 if(sum1==sum2)
	 {
		 System.out.println("equal");
	 }
	 else
	 {
		 System.out.println("not equal");
	 }
	   
   }
}
