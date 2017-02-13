import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Stack;

public class MaxHistogram {

	static int getMaxArea(int hist[], int n)
	{
	    // Create an empty stack. The stack holds indexes of hist[] array
	    // The bars stored in stack are always in increasing order of their
	    // heights.
	    Stack<Integer> s= new Stack<>();
	 
	    int max_area = 0; // Initalize max area
	    int tp;  // To store top of stack
	    int area_with_top; // To store area with top bar as the smallest bar
	 
	    // Run through all bars of given histogram
	    int i = 0;
	    while (i < n)
	    {
	        // If this bar is higher than the bar on top stack, push it to stack
	        if (s.empty() || hist[s.peek()] <= hist[i])
	            s.push(i++);
	 
	        // If this bar is lower than top of stack, then calculate area of rectangle 
	        // with stack top as the smallest (or minimum height) bar. 'i' is 
	        // 'right index' for the top and element before top in stack is 'left index'
	        else
	        {
	            tp = s.peek();  // store the top index
	            s.pop();  // pop the top
	 
	            // Calculate the area with hist[tp] stack as smallest bar
	            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
	 
	            // update max area, if needed
	            if (max_area < area_with_top)
	                max_area = area_with_top;
	        }
	    }
	 
	    // Now pop the remaining bars from stack and calculate area with every
	    // popped bar as the smallest bar
	    while (s.empty() == false)
	    {
	        tp = s.peek();
	        s.pop();
	        area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
	 
	        if (max_area < area_with_top)
	            max_area = area_with_top;
	    }
	 
	    return max_area;
	}
	
	public static int maxHistogram(int input[]){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < input.length;){
            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
            	
            	//System.out.println(stack.peekFirst());
            		
            	
 
                stack.offerFirst(i++);
            }else{
                int top = stack.pollFirst();
                //if stack is empty means everything till i has to be
                //greater or equal to input[top] so get area by
                //input[top] * i;
                if(stack.isEmpty()){
                    area = input[top] * i;
                }
                //if stack is not empty then everythin from i-1 to input.peek() + 1
                //has to be greater or equal to input[top]
                //so area = input[top]*(i - stack.peek() - 1);
                else{
                    area = input[top] * (i - stack.peekFirst() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            //if stack is empty means everything till i has to be
            //greater or equal to input[top] so get area by
            //input[top] * i;
            if(stack.isEmpty()){
                area = input[top] * i;
            }
            //if stack is not empty then everything from i-1 to input.peek() + 1
            //has to be greater or equal to input[top]
            //so area = input[top]*(i - stack.peek() - 1);
            else{
                area = input[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
	
	public static String stringReverse(String string) {
		  String reversed = "";
		  for(int i = string.length() - 1; i >= 0; i--) {
		    reversed += string.charAt(i);
		  }
		  return reversed;
		}
	
	
	
	public static String reverseString(String str){
		String reverse="";
		for(int i=str.length()-1; i>=0; i--){
			reverse+=str.charAt(i);
		}
		return reverse;
	}
	
	

	
	
	public static void main(String[] args) {
		
       /* int input[] = {1,2,1,1,2};
        int maxArea = getMaxArea(input, input.length);
        int maxArea2=maxHistogram(input);
        System.out.println(maxArea+"   "+maxArea2);
        assert maxArea == 12;*/

		
		//System.out.println(reverseString("ajdfrnbgvkdfjgkod"));
		
		
		int x = 4;
		int y = x;
		x = 2;

		
		System.out.println(y);
	}
	
	
	
	
	
	

}
