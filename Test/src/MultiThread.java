import java.util.Arrays;
import java.util.Scanner;

public class MultiThread{
	

	
	public static void main(String[] args){
		
		
		Integer[] arr = { 2, 6};
		for (int i = 1; i < arr.length; i++)
	    {
	        // a temporary copy of the current element
	        int tmp = arr[i];
	        int j;
	 
	        // find the position for insertion
	        for (j = i; j > 0; j--)
	        {
	            if (arr[j - 1] < tmp)
	                break;
	            // shift the sorted part to right
	            arr[j] = arr[j - 1];
	        }
	 
	        // insert the current element
	        System.out.println("break");
	        arr[j] = tmp;
	    }
		
		
		
		
		
        
        //Call merge sort
        
         
        //Check the output which is sorted array
        System.out.println(Arrays.toString(arr));
		
	
		
		
	}
		
	
}
