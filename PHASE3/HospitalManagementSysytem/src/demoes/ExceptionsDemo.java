package demoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {

		int noOfFruits = 10;

		int divideFruitsIntoPieces;

		Scanner scanner = new Scanner(System.in);

		System.out.println("There are 10 fruits. Enter how many peices to cut. (pls don't enter 0):");
		divideFruitsIntoPieces = scanner.nextInt();

		if (divideFruitsIntoPieces == 0) {
			System.out.println(" Hey, you have entered zero. Did you mean 1?? I will take it as 1");
			divideFruitsIntoPieces = 1;
		}
		
		float shareOfFruit = 0.0f;
		

		shareOfFruit = noOfFruits / divideFruitsIntoPieces;

		System.out.println("Each person gets " + shareOfFruit + " fruits ");

		scanner.close();

		int[] intArr = { 4, 6, 9, 13 };
		//System.err.println(intArr[4]);
		for(int i=0; i<= intArr.length ; i++)
			System.out.println(intArr[i]);

		String filePath = "F:\\Users\\home\\git\\sl-apr25\\PHASE3\\HospitalManagementSysytem\\NOTES-TASKS.txt";
		try {
			Files.readAllLines(Path.of(filePath));
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(" END ");
	}

}
