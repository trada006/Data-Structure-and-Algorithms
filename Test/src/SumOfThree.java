
public class SumOfThree {
	
	
	
	private final static void merge(int[] first, int[] second, int[] result) {
		int iFirst = 0;
		int iSecond = 0;
		int iMerged = 0;

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst] < second[iSecond]) {
				result[iMerged] = first[iFirst];
				iFirst++;
			}

			else {
				result[iMerged] = second[iSecond];
				iSecond++;
			}

			iMerged++;
		}

		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);

	}

	
	public static int[] mergeSort(int[] list) {

		if (list.length <= 1) {
			return list;
		}

		int[] first = new int[list.length / 2];
		int[] second = new int[list.length - first.length];

		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);

		mergeSort(first);
		mergeSort(second);
		merge(first, second, list);

		return list;
	}
	
	
	
	
	public static int binary_Search(int[] list, int left, int right, int value){
		
		int bLeft = left;
		int bRight = right;
		
		int middle=0;
		
		while(bLeft<=bRight){
			
			middle = (bRight+bLeft)/2;
			if(list[middle]>value){
				bRight = middle -1;
			}
			
			else if(list[middle]<value){
				bLeft = middle +1;
			}
			
			else if(list[middle]==value) {
				return -1;
			}
		}
		
		return middle;
	} 
	
	
	
	
	public static boolean isThreeSumTarget(int[] list, int num){
		
		mergeSort(list);
		
		int low = 0;
		int high = list.length-1;
		int binarySearchResult;
		while (low+1 <= high-1)
		{
			int sum =list[low]+list[high];
			binarySearchResult = binary_Search(list, low+1, high-1, num - sum);
			if(binarySearchResult==-1){
				
				System.out.println("("+list[low]+", "+list[high]+", "+(num-sum)+")");
				return true;
			}
			
			else{
				if (binarySearchResult == low+1)
				{
					high--;
				}
				
				else if(binarySearchResult == high -1){
					low++;
				}
			}
		}
		return false;
		
	}
	
	
	
	

	public static void main(String[] args) {
		int[] myList = {6,3,8,1,5,7,2};
		isThreeSumTarget(myList, 11);

	}

}
