
public class Digit_seperation {
public static void main(String[] args) {
	int x =123;
	int p = x;
	int i=0;
	while(x!=0)
	{
		int n = x%10;
		x = x/10;
		System.out.println(n);
		 i = (i*10)+n;
		
		
	}
	System.out.println(i);
}
}
