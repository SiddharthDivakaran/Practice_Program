import java.util.HashMap;

public class Replace_Frequent_Data_In_Array {
	
	public void frequency(int[] arr,int val)
	{
		
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		int y=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i],h.get(arr[i])+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
			
		}
		
		System.out.println(h.get(val));
		
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {12,13,15,12,10,9,12,11,12};
		Replace_Frequent_Data_In_Array r = new Replace_Frequent_Data_In_Array();
		r.frequency(arr,12);
		
	}
}
