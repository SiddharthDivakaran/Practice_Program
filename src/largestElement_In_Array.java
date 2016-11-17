import java.util.Arrays;

//Finding maximum and minimum element in an array
public class largestElement_In_Array
{
	public void largestElement(int [] arr)
	{
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	    
		//int s = Arrays.binarySearch(arr, 9);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,1,13,17,10,9,2,17};
		largestElement_In_Array l = new largestElement_In_Array();
		l.largestElement(arr);
	}

}
