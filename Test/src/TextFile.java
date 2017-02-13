import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class TextFile {

	
	public static int findN(int[] list, int N){
		
		boolean bool=false;
		int noN=0;
		for (int i : list){
			if (i==N){
				return N;
			}
			
			if (!bool && i<N){
				bool=true;
				noN=i;
			}
			
		}
		return noN;
	}
	
	
	public static void main(String[] args) {
		
		int[] list1 = {2,5,3,7,9,3,4,6};
		int[] list2 = {2,7,3,6};
		
		
		
		
	
		String str1="Tony";
		String str2=str1;
		
		str1="dog";
		
		
		
		
		
		
		
		

		
		
		
			System.out.println(str2);
		
		
		
		
	
	//System.out.println("result is "+findN(list, 5));
		
		
		

	}

}
