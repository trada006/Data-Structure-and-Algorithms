import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Benchmark {

	public static void QSort(int[] list, int start, int end) {
		int i = start;
		int k = end;

		if (end - start >= 1) {
			while (i < k) {
				int pivot = list[end];

				while (list[i] <= pivot && i <= end && k > i) {
					i++;
				}

				while (list[k] > pivot && k >= start && k > i) {
					k--;
				}

				if (k > i) {
					swap(list, i, k);
				}

			}

			swap(list, i, end);
			QSort(list, start, i - 1);
			QSort(list, i + 1, end);

		}

		else {
			return;
		}
	}

	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;

	}

	public static int[] selectionSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int min = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < list[min]) {
					min = j;
				}

			}

			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;

		}
		return list;
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

	private static void merge(int[] first, int[] second, int[] result) {
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

	public static boolean check(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {

			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/*public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length <= 1)
			return;

		if (low >= high)
			return;

		// pick the pivot
		
		
		//int middle = low + (high - low) / 2;
		int middle = (low+high)/2;
		
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}

	
		*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void quickSort(int[] array) {
        recursiveQuickSort(array, 0, array.length - 1);
    }

    /**
     * Recursive quicksort logic
     *
     * @param array input array
     * @param startIdx start index of the array
     * @param endIdx end index of the array
     */
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
     
        int idx = partition(array, startIdx, endIdx);

        // Recursively call quicksort with left part of the partitioned array
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (endIdx > idx) {
            recursiveQuickSort(array, idx, endIdx);
        }
    }

    /**
     * Divides array from pivot, left side contains elements less than
     * Pivot while right side contains elements greater than pivot.
     *
     * @param array array to partitioned
     * @param left lower bound of the array
     * @param right upper bound of the array
     * @return the partition index
     */
    public static int partition(int[] array, int left, int right) {
        int pivot = array[left]; // taking first element as pivot

        while (left <= right) {
            //searching number which is greater than pivot, bottom up
            while (array[left] < pivot) {
                left++;
            }
            //searching number which is less than pivot, top down
            while (array[right] > pivot) {
                right--;
            }

            // swap the values
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;

                //increment left index and decrement right index
                left++;
                right--;
            }
        }
        return left;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		int[] list = new int[10000];
		int[] list2 = new int[10000];
		int[] list3 = new int[10000];

		Random rand = new Random();
		for (int i = 0; i < 10000; i++) {

			int k = i;//rand.nextInt(1000) + 1;
			list[i] = k;
			list2[i] = k;
			list3[i] = k;
		}

		long startTime = System.nanoTime();

		mergeSort(list);
		long endTime = System.nanoTime();
		System.out.println("total time it took to execute merge sort algorithm is: " + (endTime - startTime) / 1000
				+ " mmicro seconds");

		/*startTime = System.nanoTime();
		selectionSort(list2);
		endTime = System.nanoTime();
		System.out.println("total time it took to execute selectionSort algorithm is: " + (endTime - startTime) / 1000
				+ " mmicro seconds");*/

		startTime = System.nanoTime();
		quickSort(list3);
		//quickSort(list3, 0, list3.length - 1);
		endTime = System.nanoTime();
		System.out.println("total time it took to execute QSORT algorithm is: " + (endTime - startTime) / 1000
				+ " mmicro seconds");

		// System.out.println(Arrays.toString(list3));

		System.out.println(check(list));
		//System.out.println(check(list2));
		System.out.println(check(list3));
		
		
		
		
		//System.out.println(Runtime.getRuntime());
		
		
		//Executor pool = Executors.newFixedThreadPool(2);
		//pool.execute(new QuicksortRunnable());
		
		
		
		//System.out.println(list[1000]);
		//System.out.println(list[100000]);
		
	}

}
