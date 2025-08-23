package staff;

public class GuestDoctor extends Doctor {

	String origin;

	public GuestDoctor(String name, int age, int licenseNumber, String specialist, String origin) {
		super(name, age, licenseNumber, specialist);
		this.origin = origin;
	}

	void fastDiagnose() {
		System.out.println("diagnosing.. fast....");
	}

}
