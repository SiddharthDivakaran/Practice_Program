import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample
{
	public static void main(String args[])
	{
		List<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(60);
		
		Iterator<Integer> i = al.iterator();
		ListIterator<Integer> li = al.listIterator();
		
		while(i.hasNext())
		{
			int s = i.next();
			System.out.println(al.indexOf(s)+" "+s);
		}
		
	}
	

}
