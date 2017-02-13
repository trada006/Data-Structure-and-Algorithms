

public class Node {
	

	Node next;
	Object data;
	
	
	public Node(Object dataValue){
		data=dataValue;
		next=null;	
	}
	
	public Node(Object dataValue, Node nextNode){
		data=dataValue;
		next=nextNode;
	}
	
	public Object getData(){
		return data;		
	}
	
	public void setData(Object dataValue){
		data=dataValue;		
	}
	
	
	public Node getNext()
	{
		return next;
	}
	
	public void setNext(Node nextValue)
	{
		next=nextValue;
	}
	

	public static void main(String[] args){
		
		
		
		
		
	}
	
}


	