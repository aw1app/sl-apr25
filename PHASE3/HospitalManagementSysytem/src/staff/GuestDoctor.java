package staff;

public class GuestDoctor extends Doctor {
	// below are properties unique to this class (GuestDoctor)
	String origin;
	public boolean IsWearingATie=false;

	// all other properties of the parent class (Doctor) are also here
	// via Inheritance.
	// NOTE: all except private properties.

	public GuestDoctor(String name, int age, int licenseNumber, String specialist, String origin) {
		super(name, age, licenseNumber, specialist);
		this.origin = origin;
	}

	// below are methods unique to this class (GuestDoctor)

	public void fastDiagnose() {
		// super.diagnose();
		System.out.println("diagnosing.. fast....");
	}

	// all other methods of the parent class (Doctor) are also here
	// via Inheritance.
	// NOTE: all except private methods.

	// Override parent's class (Doctor) advice() method
	@Override
	public String advice() {
		System.out.println("advising..");

		return "Take rest for 1 day";
	}
}
