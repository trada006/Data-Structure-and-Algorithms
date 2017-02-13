
public class Z {
	
	
	public void methodX(int obj){
		System.out.println(obj);
	}
	

	public static void main(String[] args) {
		
		
		X xobj = new X(){
			
			public int methodX(){
				return 7;
			}
			
			public int T(){
				return 30;
			}
		};
		
		
		
		Z newZ = new Z();
		//newZ.methodX(xobj.T());
		
		

	}

}
