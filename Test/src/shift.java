import java.math.BigInteger;
import java.util.Arrays;

public class shift {

	
	public static int findMin(int[] arr, int lower, int higher){
		
		if (arr[lower]<arr[higher]){
			return arr[0];
		}
		
		if (lower==higher){
			return arr[lower];
		}
		
		
		int middle = lower + (higher - lower)/2;
		
		// [3,4,5,1,2]
		
		if(middle<higher && arr[middle]>arr[middle+1]){
			return arr[middle+1];
		}
		
		//[5,6,7,1,2,3,4]
		
		if(middle > lower && arr[middle] < arr[middle-1]){
			return arr[middle];
		}
		
		
		
		
		if(arr[higher]>arr[middle]){
			return findMin(arr, lower, middle-1);
		}
		else return findMin(arr, middle+1, higher);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] array={2,1};
		
		System.out.println(findMin(array, 0, array.length-1));
		
		
	}

}



	





