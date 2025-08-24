package tasks;

//Main Method
import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int radius;

		System.out.print("Enter the radius : ");
		radius = sc.nextInt();

		Circle c1 = new Circle(radius);
		System.out.println("Area of circle c1 = " + c1.area());

		System.out.print("\nEnter the radius : ");
		radius = sc.nextInt();

		Circle c2 = new Circle(radius);
		System.out.println("Area of circle c1 = " + c2.area());

		sc.close();
	}
}
