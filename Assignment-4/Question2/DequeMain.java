import java.util.Scanner;

public class DequeMain {

	public static void main(String[] args) {
		Deque dq = new Deque();
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		do {
			System.out.println("1.push from rear\n2.push from front\n"
					+ "3.pop from rear\n4.pop from front\n5. Size of the Deque\n6.display deque");
			choice = sc.nextInt();
			
		switch (choice) {
		case 1:
			System.out.println("Enter the element:");
			value = sc.nextInt();
			dq.pushRear(value);
			break;
		
		case 2:
			System.out.println("Enter the element:");
			value = sc.nextInt();
			dq.pushFront(value);
			break;
			
		case 3:
			value = dq.popRear();
			if(value!=0)
				System.out.println("pop from rear: " + value);
			else
				System.out.println("Deque is empty");
			break;
			
		case 4:
			value = dq.popFront();
			if(value!=0)
				System.out.println("pop from front: " + value);
			else
				System.out.println("Deque is empty");
			break;
			
		case 5:
			int size = dq.size();
			if(size!=0)
			System.out.println("Size: " + dq.size());
			else
				System.out.println("Deque is empty");
			break;
			
		case 6:
			dq.display();
			break;
			
		default:
			break;
		}

	}while(choice!=0);

}
}
