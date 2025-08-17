
public class Doctor {
	
	//properties / fields / instance variables
	String name;
	int age;
	
	long phone;
	
	int licenseNumber;
	
	String degree;
	String specialist;
	
	
	// methods
	void performSurgery(){
		System.out.println("Starting surgery ");
	}
	
	void diagnose(){
		System.out.println("diagnosing..");
	}
	
	String advice(){
		System.out.println("advising..");
		
		return "Take rest for 1 week";
	}

}
