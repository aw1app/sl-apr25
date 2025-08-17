package customers;


import java.util.Date;

public class Patient {

	// properties / fields / instance variables
	String name;
	int age;

	String disease;

	long phone;

	// methods / actions / behaviors
	void visitHospital(Date d) {
		System.out.println("Visiting the hospital .. on date  " + d );
	}

	void bookAppointment(Doctor doctor) {
		System.out.println("Taking an appointment to meet doctor ..." + doctor.name);
	}

}
