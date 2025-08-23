// File: InPatient.java
package customer;

import java.util.Date;

// Subclass of Patient
public class InPatient extends Patient {

// New properties
	private int roomNumber;
	private Date admissionDate;

// Constructor
	public InPatient(String name, int age, long phone, String disease, int roomNumber, Date admissionDate) {
		super(name, age);
		this.phone = phone;
		this.disease = disease;
		this.roomNumber = roomNumber;
		this.admissionDate = admissionDate;
	}

// New method
	public void discharge() {
		System.out.println(name + " has been discharged on " + new Date());
	}

// Overriding a method from Patient
	@Override
	public void visitHospital(Date d) {
		System.out.println(name + " is admitted in room " + roomNumber + " since " + admissionDate);
	}

// Getters
	public int getRoomNumber() {
		return roomNumber;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}
}