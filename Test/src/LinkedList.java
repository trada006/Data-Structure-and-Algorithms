
public class LinkedList {

	private static int counter;
	private Node head;
	
	public LinkedList(){
		
	}
	
	public void add(Object data){
		if (head==null)
		{
			head=new Node(data);
		}
		
		
		
		else if (head != null){
			Node temp = new Node(data);
			Node current = head; 
			
			while(current.getNext() != null){
				current = current.getNext();
			}
			current.setNext(temp);
			counter++;		
		}
	}
	
	//hello
	
	public static int getCounter(){
		return counter;
	}
	
	
	public void decrementCounter(){
		counter--;
	}
	
	
	public int size(){
		return getCounter();
	}
	
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.add("hello");
		LL.add("fuck");
		LL.add("kiss");
		
		System.out.println(LL.head.next.data);
		
		//System.out.println(LL.size());

		
		
	}

}
