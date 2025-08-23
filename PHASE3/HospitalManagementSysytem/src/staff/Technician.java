package staff;

public class Technician {
	// properties / fields / instance variables
	public String name;
	public int age;
	public long phone;
	int technicianId;
	public String department;
	public String shift;

	// methods / actions / behaviors
	public void maintainEquipment() {
		System.out.println("Maintaining medical equipment...");
	}

	void assistProcedure() {
		System.out.println("Assisting in medical procedure...");
	}

	String reportIssue() {
		System.out.println("Reporting an issue...");
		return "Equipment requires maintenance";
	}
}