package Question_1;

public class List {
	static class Node {
		private char data;
		private Node next;

		public Node(char value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int count;

	public List() {
		tail = null;
		count = 0;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(char value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}

	public void addLast(char value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}

	public void addPosition(char value, int pos) {
		Node newnode = new Node(value);
		if (pos < 1 || pos > count) {
			System.out.println("Invalid position");
			return;
		} else if (isEmpty() || pos <= 1) {
			addFirst(value);
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			tail.next = tail.next.next;
		}
		count--;
	}

	public void deleteLast() {
		Node trav = tail;
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else {
			while (trav.next != tail) {
				trav = trav.next;
			}
			tail = trav;
			tail.next = trav.next.next;
		}
		count--;
	}

	public void deletePosition(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		else if (pos<1 || pos > count -1 ) {
			System.out.println("Invalid position");
		}
		else {
			Node trav = tail;
			for (int i=0; i<pos -1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			count--;
			if(trav.next==tail) {
				tail = trav;
			}
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List Is Empty");
		} else {
			Node trav = tail;
			System.out.println("List :");
			do {
				trav = trav.next;
				System.out.println(trav.data);
			} while (trav != tail);
			System.out.println("Count : " + count);
		}
	}
	
	public void deleteAll() {
		tail = null ;
	}

}
