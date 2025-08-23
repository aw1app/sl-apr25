package customers;


import java.util.Date;

import staff.Doctor;

 public abstract class Patient {

	// properties / fields / instance variables
	public String name;
	public int age;

	public String disease;

	public long phone;
	
	public Patient(String name, int age) {
		this.age=age;
		this.name=name;
	}

	// methods / actions / behaviors
	public void visitHospital(Date d) {
		System.out.println("Visiting the hospital .. on date  " + d );
	}

	public void bookAppointment(Doctor doctor) {
		System.out.println("Taking an appointment to meet doctor ..." + doctor.name);
	}
	
	abstract public void payBill(int amount);

}
