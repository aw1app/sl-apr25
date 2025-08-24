package demoes;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

		int noOfFruits = 10;

		int divideFruitsIntoPieces;

		Scanner scanner = new Scanner(System.in);

		System.out.println("There are 10 fruits. Enter how many peices to cut. (pls don't enter 0):");
		divideFruitsIntoPieces = scanner.nextInt();

		float shareOfFruit=0.0f;
		try {
			shareOfFruit = noOfFruits / divideFruitsIntoPieces;
		} catch (ArithmeticException e) {
			System.out.println(" caught an exception " + e);
		}
		
		System.out.println("Each person gets " + shareOfFruit + " fruits ");

		System.out.println(" END ");
		scanner.close();
	}

}
