

public class Queue {
	static class Node{
		private int data;
		private Node next;
		
	public Node(int value) {
		data = value;
		next = null;
	}
	}
	
	private Node head;
	
	public Queue() {
		head = null;
	}
	
	
	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public int pop() {
		int value;
		if(head==null)
			return 0;
		else if(head.next==null) {
			value = head.data;
			head=null;
			return value;
		}
		else {
			Node trav = head;
			while(trav.next.next!=null)
				trav = trav.next;
			value = trav.next.data;
			trav.next = null;
			return value;
		}
	}
	
	public int peek() {
		if(head==null)
			return 0;
		else {
		Node trav = head;
		while(trav.next!=null)
			trav = trav.next;
		return trav.data;
	}
}
}
