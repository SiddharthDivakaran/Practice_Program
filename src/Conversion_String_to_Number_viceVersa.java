
public class Conversion_String_to_Number_viceVersa {
	public static void main(String[] args) {
		String str = "10";
		//Converting to integer
		int x = Integer.parseInt(str);
		System.out.println(x);
		
		double d = 10.2;
		String st = String.valueOf(d);
		System.out.println(st);
		
		String v = "\"12\"";
		System.out.println(v);
		//getting number between quotes
		
		String s = v.split("\"")[1];
		System.out.println(s);
		
		String j = "Sam#SpiderMan";
		String y = j.split("#")[1];
		System.out.println(y);
		
		
	}

}
