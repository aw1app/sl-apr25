import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {

		MyMethod x1 = new MyMethod();

		x1.m2();
		
		x1.m2();
		
		int result = x1.m2b(10);
		System.out.println(result); // 50
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number. You will get 5 times of it:");
		int input  = scanner.nextInt();
		
		int result2 = x1.m2b(input);
		System.out.println(result2); // 		
		
		
		scanner.close();
	}

}
