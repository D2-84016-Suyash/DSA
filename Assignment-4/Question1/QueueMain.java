import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		do {
			System.out.println("1.push an element\n2.pop an element\n3. peek an element");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the element");
				value = sc.nextInt();
				q.push(value);
				break;
				
			case 2:			
				value = q.pop();
				if(value!=0)
					System.out.println("popped element: " + value);
				else
					System.out.println("Queue is Empty");
				break;
				
			case 3:
				value = q.peek();
				if(value!=0)
					System.out.println("peeked element: " + value);
				else
					System.out.println("Queue is Empty");
				break;
	
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice!=0);
	}
	}

