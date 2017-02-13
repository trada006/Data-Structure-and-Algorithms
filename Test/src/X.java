import java.util.Arrays;

public class X extends Y{
	
	//public static int[] b;
	
	public static void run(int[] x){
		int[] b=x;
		b[2]=5;
		
		x=new int[2];
		x[0]=2;
		x[1]=2;
	}
	

	public static void main(String[] args) {
		
		int[] c={1,1,1,1,1,1,1};
		System.out.println(Arrays.toString(c));
		
		run(c);
		
		
		System.out.println(Arrays.toString(c));
		

	}

	

	
	
	
	

}
