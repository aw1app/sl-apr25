package customers;


import java.util.Date;

import exceptions.DoctorNotFoundException;
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

	public void bookAppointment(Doctor doctor) throws DoctorNotFoundException{
		System.out.println("Taking an appointment to meet doctor ..." + doctor.name);
		
		if(!doctor.isAvailable)
			throw new DoctorNotFoundException(doctor.name + " is not available today!");
	}
	
	abstract public void payBill(int amount);

}
