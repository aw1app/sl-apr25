package staff;

public class Doctor {

	// properties / fields / instance variables
	public String name;
	private int age;

	long phone;

	int licenseNumber;

	public String degree;
	public String specialist;

	/*
	 * CONSTRUCTORS (constructors are like methods, whose sole job is to create
	 * objects.
	 * 
	 */

	// default constructor
	public Doctor() {

	}

	// custom constructors
	public Doctor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Doctor(String name, int age, int licenseNumber) {
		this(name, age);

		this.licenseNumber = licenseNumber;
	}

	public Doctor(String name, int age, int licenseNumber, String specialist) {
		this(name, age, licenseNumber);

		this.specialist = specialist;
	}

	// TASK-2: Create a custom constructor that will set all the properties of this
	// class.
	Doctor(String name, int age, int licenseNumber, String specialist, long phone, String degree) {
		this(name, age, licenseNumber, specialist);

		this.phone = phone;
		this.degree = degree;
	}

	// methods / actions / behaviors
	public String getName(){
		
		return this.name;
	}
	
	
	void setName(String name){
		//
		// send an OTP
		//
		// if(OTP succeeded){
		 this.name = name;
		 //}
			
	}
	
	
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
