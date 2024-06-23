package Question_1;

public class SinglyCircular {
	public static void main(String[] args) {
		List l = new List();
		l.addFirst('a');
		l.addFirst('b');
		l.addFirst('c');
		l.addFirst('d');
		l.addFirst('e');
		l.addLast('s');
//		l.deleteFirst();
		l.deleteLast();
//		l.deleteAll();
		l.display();
	}
}
