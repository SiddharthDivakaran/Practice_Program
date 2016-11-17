 public class ReverseString 
{
   public StringBuilder reverse(String str)
   {
	 String s[]=str.split(" ");
	 StringBuilder sb = new StringBuilder();
	 for(int i=0;i<s.length;i++)
	 {
		 char ch[] = s[i].toCharArray();
		 for(int j=ch.length-1;j>=0;j--)
		 {
			 sb.append(ch[j]);
		 }
		 sb.append(" ");
		 
	 }
	   return sb;
   }
   
   public static void main(String[] args) 
   {
	  ReverseString r = new ReverseString();
	  
	  String str = "This  is  an  example";
	  System.out.println(r.reverse(str));
   }
}
