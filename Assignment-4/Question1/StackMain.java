import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		do {
			System.out.println("1.push an element\n2.pop an element\n3. peek an element\n4.display all the elements");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the element");
				value = sc.nextInt();
				st.push(value);
				break;
				
			case 2:			
				value = st.pop();
				if(value!=0)
					System.out.println("popped element: " + value);
				else
					System.out.println("Stack is Empty");
				break;
				
			case 3:
				value = st.peek();
				if(value!=0)
					System.out.println("peeked element: " + value);
				else
					System.out.println("Stack is Empty");
				break;
				
			case 4:
				st.display();
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice!=0);
		

	}

}
