

public class Stack {
	static class Node{
		private int data;
		private Node next;
		
	public Node(int value) {
		data = value;
		next = null;
	}
	}
	
	private Node head;
	
	public Stack() {
		head = null;
	}
	
	
	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public int pop() {
		if(head==null)
			return 0;
		else {
			int value = head.data;
			head= head.next;
		return value;
	}
	}	
	
	public int peek() {
		if(head==null)
			return 0;
		else
		return head.data;
	}
	
	
	public void display() {
		Node trav = head;
		while(trav!=null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
	}
	}
}
