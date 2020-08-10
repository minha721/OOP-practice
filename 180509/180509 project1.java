package practice1;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
	int[] arr = new int[120];	
		
	for(int i=0; i<120; i++) {
		arr[i] = (int)(Math.random()*10000);
	}
	
	System.out.print("Enter an index: ");
    Scanner input = new Scanner(System.in);
    int index = input.nextInt();
			
	try {
		System.out.println("The element is " + readArray(arr, index));
	}
	catch(IndexOutOfBoundsException ex) {
		 System.out.println("Index out of bound");
	}
	}
	
	public static int readArray(int arr[], int num) throws IndexOutOfBoundsException {		
		if(num<=arr.length)
			return arr[num];
		else
			throw new IndexOutOfBoundsException("Index out of bound");
	}
}