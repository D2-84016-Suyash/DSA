package question1;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int arr[] = {0, 6, 14, 3, 26, 8, 18, 21, 9, 5};
		
		Heap h = new Heap();
		
		System.out.println("Array before : " + Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("Array after : " + Arrays.toString(arr));
	}

}
