import java.util.Arrays;

public class sort {

	public static void quicksort(int[] array, int start, int end) {

		int i = start; // index of left to right scan
		int k = end; // index of right to left scan

		if (end - start >= 1) {
			int pivot = array[end]; // sets the last element as the array
			while (k > i) { // while the scan indices from left and right have
							// not met
				while (array[i] <= pivot && i <= end && k > i) // from the left
																// look for the
																// first element
																// not smaller
																// than pivot
					i++;
				while (array[k] > pivot && k >= start && k > i) // from the
																// right look
																// for the first
																// element not
																// greater than
																// the pivot
					k--;
				if (k > i) // if the left index is still smaller than the right
							// index, swap the corresponding elements
					swap(array, i, k);
			}
			swap(array, end, k); // after the indices have crossed swap the last
									// element in the right with the pivot
			quicksort(array, start, i - 1);
			quicksort(array, i + 1, end);
		}

		else {
			return;
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	
	
	
	
	
	
	
	
	
	
	static void qqsort(int array[], int start, int end) {
	    int i = start; // index of left-to-right scan
	    int k = end; // index of right-to-left scan

	    if (end - start >= 1) { // check that there are at least two elements to sort 
	        int pivot = array[start]; // set the pivot as the first element in the partition
	        while (k > i) { // while the scan indices from left and right have not met, 
	            while (array[i] <= pivot && i <= end && k > i)  // from the left, look for the first element greater than the pivot
	                i++;
	            while (array[k] > pivot && k >= start && k >= i) // from the right, look for the first element not greater than the pivot
	                k--;
	            if (k > i) // if the left seekindex is still smaller than the right index, swap the corresponding elements
	                swap(array, i, k);              
	        }
	        swap(array, start, k); // after the indices have crossed, swap the last element in the left partition with the pivot 
	        qqsort(array, start, k - 1); // quicksort the left partition
	        qqsort(array, k + 1, end); // quicksort the right partition
	    } else { // if there is only one element in the partition, do not do any sorting 
	        return;
	    }
	}
	
	
	
	
	
	
	public static boolean binarySearch(int[] list, int val){
		int low=0;
		int high=list.length-1;
		boolean found=false;
		int index = (low+high)/2;
		int middle = 0;
		while(high>=low && !found){
			middle = (low+high)/2;
			
			
			if(list[middle] <val){
				low=middle+1;
				
				
			}
			else if(list[middle]>val){
				high=middle-1;
				
			}
			
			else{
				//System.out.println("index is "+middle);
				found=true;
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		return found;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 5, 8, 8, 13, 14, 24, 36 };
		// quicksort(array, 0, array.length - 1);

		//System.out.println(binarySearch(array, 1));

		// System.out.println(Arrays.toString(array));

		
		//sort mm= new sort();
		
		
		
		char[] test = new char[4];;
		
		test[0]=70;
		test[1]=0x50;
		test[2]=144%73;
		test[3]=0;
		
		System.out.println(test[1]+" hello");
		
		
	}

}
