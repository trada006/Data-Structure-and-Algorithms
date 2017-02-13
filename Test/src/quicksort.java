import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class quicksort {

	public static int findKthLargest(int[] nums, int k) {
		int start = 0, end = nums.length - 1, index = nums.length - k;
		while (start < end) {
			int pivot = partion(nums, start, end);
			if (pivot < index)
				start = pivot + 1;
			else if (pivot > index)
				end = pivot - 1;
			else
				return nums[pivot];
		}
		return nums[start];
	}

	private static int partion(int[] nums, int start, int end) {
		int pivot = start, temp;
		while (start <= end) {
			while (start <= end && nums[start] <= nums[pivot])
				start++;
			while (start <= end && nums[end] > nums[pivot])
				end--;
			if (start > end)
				break;
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
		}
		temp = nums[end];
		nums[end] = nums[pivot];
		nums[pivot] = temp;
		return end;
	}

	/*public static int[] removeDuplicates(int[] list) {

		Arrays.sort(list);

		int[] b = new int[list.length];
		b[0] = list[0];

		int index = 0;
		for (int i = 1; i < list.length; i++) {
			if (list[i] == b[index]) {
				continue;
			} else {
				b[++index] = list[i];
				// index++;
			}
		}

		return b;

	}*/
	
	
	
	
	
	public static int[] removeDuplicates(int[] list) {

		
		Set<Integer> set = new HashSet<>();

		for(int i:list){
			set.add(i);
		}
		
		
		int[] newArray=new int[set.size()];
		
		int index=0;
		for(int i: set){
			newArray[index++]=i;
		}
    	
		return newArray;


	}

	public static int[] xor(int[] A, int[] B) {

		Arrays.sort(A);
		Arrays.sort(B);
		int index = 0;
		int[] xor = new int[10];
		for (int x : B) {
			if (!sort.binarySearch(A, x)) {
				xor[index++] = x;
			}
		}

		for (int x : A) {
			if (!sort.binarySearch(B, x)) {
				xor[index++] = x;
			}
		}

		return xor;

	}

	public static int[] unique(int[] list){
    	
    	Set<Integer> set = new HashSet<>();
    	Arrays.sort(list);
    	
    	for(int i: list){
    		if (set.add(i)==false)
    		{
    			set.remove(i);
    		}
    		
    	}
    	
    	//set.remove(1);
    	
		
		int[] newArray=new int[set.size()];
		
		int index=0;
		for(int i: set){
			newArray[index++]=i;
		}
    	
		return newArray;
    	
    }

	
	
	
	
	
	
	public static int findMissingNumber(int[] list1, int[] list2){
		int xor=0;
		for(int a : list1){
			xor^=a;
		}
		
		for(int b : list2){
			xor^=b;
		}
		
		return xor;
		
	}
	
	public static int[] removeDup(int[] list){
		
		int noOfUniqueElements = list.length;
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                 
                if(list[i] == list[j])
                {
                    //Replace duplicate element with last unique element
                     
                    list[j] = list[noOfUniqueElements-1];
                     
                    //Decrementing noOfUniqueElements
                     
                    noOfUniqueElements--;
                     
                    //Decrementing j
                     
                    j--;
                }
            }
        }
		
		int[] arrayWithoutDuplicates = Arrays.copyOf(list, noOfUniqueElements);
		return arrayWithoutDuplicates;
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		Random rand = new Random();
		int[] list1 = new int[4];
		int[] list2 = new int[3];

		list1[0] = 1;
		list1[1] = 2;
		list1[2] = 1;
		list1[3] = 4;
		
		
		
		
		

		list2[0] = 3;
		list2[1] = 4;
		list2[2] = 2;
	

		//removeDup(list1);
		
		

		//System.out.println("missing number is "+findMissingNumber(list1, list2));

		// Arrays.sort(list);

		for (int i : removeDup(list1)) {
			System.out.println(i);
		}

	}

}
