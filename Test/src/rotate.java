import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class rotate {


	
	public static void findPairWithSum3(int[] matrix, int sum){
		Hashtable<Integer,Integer> comp=new Hashtable<Integer,Integer>();
		for(int value: matrix){
			if(comp.containsKey(value)){
				System.out.println("("+value+", "+comp.get(value));
			}
			else{
				comp.put(sum-value, value);
			}
		}
	} 
	
	
	public static void rotateMatrix90(int[][] matrix){
		transpose(matrix);
		
		for(int i=0; i<matrix.length/2; i++){
			for(int j=0; j<matrix[0].length; j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[matrix[0].length-1-i][j];
				matrix[matrix[0].length-1-i][j]=temp;
				
				
			}
		}
		
	}
	                              
	
	
		
	
	
	private static void transpose(int[][] matrix) {
		for(int i=0; i<matrix.length; i++){
			for(int j=i; j<matrix[0].length; j++){
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}


	
	
	
	public static boolean findPairMatchesSum(int[] matrix, int sum){
		for(int i=0; i<matrix.length; i++){
			for(int j=i+1; j<matrix.length; j++){
				if(matrix[i]+matrix[j]==sum){
					System.out.println("the pair is "+matrix[i]+", " +matrix[j]);
					return true;
				}
			}
		}
		return false;
	} 


	
	
	public static void findPairWithSumHash(int[] input, int sum){
	    Set<Integer> previousInts = new HashSet<>();

	    for (int i : input) {
	    	
	        if (previousInts.contains(sum - i)) {
	             System.out.print("("+i+", "+(sum-i)+")\n");
	        } 
	        
	        
	        else {
	             previousInts.add(i);
	        }
	    }
	    
	    
	    
String str=new String("fuck");
		
		str="dog";
		System.out.println(str);
	    
	}
	
	
	
	
	
	
	
	
	
	
	/*public static void findPairWithSumHash(int[] matrix, int sum){
		Hashtable<Integer, Integer> comp = new Hashtable<Integer, Integer>();
		
		
		for(int i=0; i<matrix.length; i++){
			if(comp.containsKey(matrix[i]))
			{
				System.out.println("("+matrix[i]+", "+comp.get(matrix[i])+")");
			}
			else{
				comp.put(sum-matrix[i], matrix[i]);
			}
		}
		
		//System.out.println(comp.containsKey(-6));
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean findPairWithSum(int[] matrix, int sum){
		int i=0;
		int j=matrix.length-1;
		while (i<j){

			while(i<j && matrix[i]+matrix[j]>sum){
				j--;
				//System.out.println("("+matrix[i]+", "+matrix[j]+")");
				//return true;
			}
			while(i<j && matrix[i]+matrix[j]<sum){
				i++;
			}
			if(i<j){
				System.out.println("("+matrix[i]+", "+matrix[j]+")");
				i++;
				j--;
			}
		}
		
		return false;
	}
	
	public static boolean findPairWithSum2(int[] matrix, int sum){
		int i=0;
		int j=matrix.length-1;
		while (i<j){

			if(matrix[i]+matrix[j]>sum){
				j--;
				//System.out.println("("+matrix[i]+", "+matrix[j]+")");
				//return true;
			}
			else if(matrix[i]+matrix[j]<sum){
				i++;
			}
			else if(matrix[i]+matrix[j]==sum){
				System.out.println("("+matrix[i]+", "+matrix[j]+")");
				i++;
				j--;
			}
		}
		
		return false;
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

	
	
	
	
	
		public static int factorial(int num)
		{
			if(num<=1){
				return 1; 
			}
			
			else{			
				return num*factorial(num-1);		
			}
			
			
		}
	

public static void Strangemethod(int len) {
    while(len > 1){
    	
        System.out.println(len-1);
        
        Strangemethod(len - 1);
        len--;
    }
    
    
    
}
	









/*

public static ArrayList<String> permutation(String s) {
    // The result
    ArrayList<String> res = new ArrayList<String>();
    // If input string's length is 1, return {s}
    if (s.length() == 1) {
        res.add(s);
    } else if (s.length() > 1) {
        int lastIndex = s.length() - 1;
        // Find out the last character
        String last = s.substring(lastIndex);
        // Rest of the string
        String rest = s.substring(0, lastIndex);
        // Perform permutation on the rest string and
        // merge with the last character
        res = merge(permutation(rest), last);
    }
    return res;
}

*//**
 * @param list a result of permutation, e.g. {"ab", "ba"}
 * @param c    the last character
 * @return     a merged new list, e.g. {"cab", "acb" ... }
 *//*
public static ArrayList<String> merge(ArrayList<String> list, String c) {
    ArrayList<String> res = new ArrayList<String>();
    // Loop through all the string in the list
    for (String s : list) {
        // For each string, insert the last character to all possible postions
        // and add them to the new list
        for (int i = 0; i <= s.length(); ++i) {
            String ps = new StringBuffer(s).insert(i, c).toString();
            res.add(ps);
        }
    }
    return res;
}

*/




	public static void swap(int x, int y){
		int temp = x;
		x=y;
		y=temp;
	}

	public static void shuffle(int[] array){
		for(int i=0; i<array.length; i++){
			int rand = i+(int)(Math.random()*(array.length-i));
			int temp=array[rand];
			array[rand]=array[i];
			array[i]=temp;
		}
	}


	
	
	/*
	public static int stocks_dc(int[] array, int n){
		if(n==0){
			return 0;
		}
		
		if(n==1){
			return Math.max(array[0], 0);
		}
		
		int half = n/2;
		int left_stocks_dc=stocks_dc(array, half);
		int right_stocks_dc=stocks_dc(array, n-half);
		
	} */
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		
		
		
		/*
		
		int[] array = new int[10];
		int j=0;
		for(int i=-5; i<=4; i++ ){
			array[j++]=i;
		}
		
		
		
		shuffle(array);
		
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}*/
		
		//Random rand=new Random();
		//int k=rand.nextInt(2)+1;
		
		//int ran=i+(int)(Math.random()*(((array.length-1)-i)+1));
		
		//System.out.println(ran);
		
		
		
		//System.out.println(factorial(1));
		
		/*Random rand=new Random();
		int[][] matrix=new int[5][5];
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				matrix[i][j]=rand.nextInt(9)+1;
			}
		}
		
		
		
		for(int i=0; i<5; i++){	
			System.out.println("["+matrix[i][0]+","+matrix[i][1]+","+matrix[i][2]+","+matrix[i][3]+","+matrix[i][4]+"]");
			
		}
		
		System.out.println("");
		
		rotateMatrix90(matrix);
		
		
		for(int i=0; i<5; i++){	
			System.out.println("["+matrix[i][0]+","+matrix[i][1]+","+matrix[i][2]+","+matrix[i][3]+","+matrix[i][4]+"]");
			
		}*/
		
		
		
		int[] matrix = { 3, 4, 4, 4, 6, 2, 5, 5, 3};
		//findPairWithSum3(matrix, -3);
		findPairWithSumHash(matrix, 8);
		
		
		
		
		//System.out.println(str.substring(1,1));
		
		
		
		//permutation(str);
		
		//Strangemethod(3);
		
	}
	
}