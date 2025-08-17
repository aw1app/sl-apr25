
public class Doctor {

	// properties / fields / instance variables
	String name;
	int age;

	long phone;

	int licenseNumber;

	String degree;
	String specialist;

	/*
	 * CONSTRUCTORS (constructors are like methods, whose sole job is to create
	 * objects.
	 * 
	 */

	// default constructor
	Doctor() {

	}

	// custom constructors
	Doctor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Doctor(String name, int age, int licenseNumber) {
		this(name, age);

		this.licenseNumber = licenseNumber;
	}

	Doctor(String name, int age, int licenseNumber, String specialist) {
		this(name, age, licenseNumber);

		this.specialist = specialist;
	}

	
	// TASK-2: Create a custom constructor that will set all the properties of this class.
	
	// methods / actions / behaviors
	void performSurgery() {
		System.out.println("Starting surgery ");
	}

	void diagnose() {
		System.out.println("diagnosing..");
	}

	String advice() {
		System.out.println("advising..");

		return "Take rest for 1 week";
	}

	public String toString() {
		return this.name + " , " + this.age + ", " + this.licenseNumber + ", " + this.specialist;
	}

}
