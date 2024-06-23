
public class Deque {
	class Node {
	    int data;
	    Node prev, next;

	    public Node(int data) {
	        data = data;
	        prev = next = null;
	    }
	}
	    
	    private Node head, tail;
	    private int size;

	    public Deque() {
	        head = tail = null;
	        size = 0;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }
 
	    public int size() {
	      return size;
	    }
	    
	    public void pushRear(int value) {
			Node newnode = new Node(value);
			if(head==null && tail==null)
				head=tail=newnode;
			else {
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
			}
			size++;
		}
	    
	    public void pushFront(int value) {
			Node newnode = new Node(value);
			if(head==null && tail==null)
				head=tail=newnode;
			else {
					newnode.prev = tail;
					tail.next = newnode;
					tail = newnode;
			}
			size++;
		}
	    
	    public int popRear() {
	    	int value;
			if(head==null && tail==null)
				return 0;
			else if(head==tail) {
				value=head.data;
				head=tail=null;
				size--;
				return value;
			}
			else {
				value = head.data;
				head = head.next;
				head.prev = null;
			size--;
			return value;
			}
		}
	    
	    public int popFront() {
	    	int value;
			if(head==null && tail==null)
				return 0;
			else if(head==tail) {
				value = head.data;
				head=tail=null;
				size--;
				return value;
			}
			else {
				value = tail.data;
				tail = tail.prev;
				tail.next = null;
				size--;
				return value;
			}
		}
	    
	    public void display() {
			Node trav = head;
			while(trav!=null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println("");
		}
}
