import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Reverse {
	
	public static Node reverse(Node currentNode){
		
		Node previousNode=null;
		Node nextNode;
		
		
		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
			
		}
		
		return previousNode;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		
		//System.out.println(n1.next.data);
		
		
		Integer x = 4;
		Integer y = x;
		x = 100;

		
		System.out.println(y);
		
		
		
		
		
		
		
		
		
		
	}

}
