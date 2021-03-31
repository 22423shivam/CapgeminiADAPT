package CapgeminiAssignment;
import java.util.Scanner;

public class Assignment1Q7 {
	public static void main(String[] args) {
		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

		int counter = 0;
		int length = arr.length;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to search in the array : ");
		int search = scan.nextInt();
		scan.close();

		for (int i = 0; i < length; i++) {
			if (search == arr[i]) {
				// System.out.println("The number is found in the array");
				System.out.println("Target value " + search + " found at index " + i);
				counter++;
				break;
			}

		}

		if (counter == 0) {

			System.out.println("The number is not found in the array");

		}

	}
}

