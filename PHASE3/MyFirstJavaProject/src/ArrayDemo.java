import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declare and initialize an integer array with 10 elements
		int[] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Access and print the second element of the array
		System.out.println(myArray[1]);

		// looping
		System.out.println("*****Looping demo ***");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		//
		System.out.println("************");

		// declare an array of integers with a size of 5
		int[] myArrayOfFiveElements = new int[5];
		myArrayOfFiveElements[0] = 10;

		myArrayOfFiveElements[3] = 100;

		System.out.println(myArrayOfFiveElements[1]); // ?? 0

		// System.out.println(myArrayOfFiveElements[5]); // ?? error / exception

		/// 2d array
		int[][] numbers1 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 14, 15 } };

		System.out.println(Arrays.toString(numbers1[1]));

		//// nice print of a 2d array
		int[][] numbers = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 } };
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + "\t");
			}
			
			System.out.println("");
		}

	}

}