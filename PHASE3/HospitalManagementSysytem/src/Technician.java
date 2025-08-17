
public class Technician {
	// properties / fields / instance variables
	String name;
	int age;
	long phone;
	int technicianId;
	String department;
	String shift;

	// methods / actions / behaviors
	void maintainEquipment() {
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