package demoes;

public class StaticDemo {

	public static void main(String[] args) {

		Student s1 = new Student("Bhaskar");
		Student s2 = new Student("Mary");
		
		System.out.println("Total number of students in this class Student.getCounter() = " + Student.getCounter());
		System.out.println("Total number of students in this class s1.getCounter() =" + s1.getCounter());

		System.out.println("Student.x = " + Student.x);

		System.out.println("s1.x = " + s1.x);
		System.out.println("s2.x = " + s2.x);

		System.out.println("\n doing this now ... Student.x = 100");
		Student.x = 100;

		System.out.println("Student.x = " + Student.x);

		System.out.println("s1.x = " + s1.x);
		System.out.println("s2.x = " + s2.x);
		
		System.out.println("\n doing this now ... s1.x = 1000;");
		s1.x = 1000;
		
		System.out.println("Student.x = " + Student.x);

		System.out.println("s1.x = " + s1.x);
		System.out.println("s2.x = " + s2.x);

	}

}
