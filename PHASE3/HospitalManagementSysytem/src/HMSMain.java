

import customers.Patient;
import staff.Doctor;
import staff.GuestDoctor;
import staff.Technician;

public class HMSMain {

	public static void main(String[] args) {

//		Doctor doctor1 = new Doctor(); // doctor class object
//		doctor1.name = "Madan";
//		doctor1.age = 45;
//		doctor1.licenseNumber = 345345346;
//		doctor1.specialist = "Cardiac Surgeon";

		Doctor doctor1 = new Doctor("Madan", 45, 345345346, "Cardiac Surgeon");

		System.out.println(doctor1.getName());
//		doctor1.name="Baba";
		doctor1.setName("Baba");

		System.out.println("Doctor 1 details :  " + doctor1.toString());

		String docAdvice = doctor1.advice();
		System.out.println("Advice from doctor 1:  " + docAdvice);

		Doctor doctor2 = new Doctor("Mohini", 47); // doctor class object
		//doctor2.licenseNumber = 56565656;
		doctor2.specialist = "Dental";

		System.out.println("Doctor 2 details :  " + doctor2);

		String docAdvice2 = doctor2.advice();
		System.out.println("Advice from doctor 2:  " + docAdvice2);

		Doctor doctor3 = new Doctor("Suman", 41, 343434535, "Dental");
		String docAdvice3 = doctor3.advice();

		System.out.println("Doctor 3 details :  " + doctor3);
		System.out.println("Advice from doctor 3:  " + docAdvice3);

		Patient patient1 = new Patient();
		patient1.age = 21;
		patient1.name = "Mohan";
		patient1.disease = "toothache";

		patient1.bookAppointment(doctor2);

		// TASK-1: Create a Technican and let that technician do some activity
		Technician technician = new Technician();
		technician.name = "ravi";
		technician.age = 32;
		technician.department = "electrical work";
		technician.shift = "night";

		technician.maintainEquipment();

		// Create GuestDoctors
		System.out.println("\n\n Announcing Guest Doctors at this Hospital !!  ");
		GuestDoctor gdoctor1 = new GuestDoctor("Hitakito", 34, 3563563, "Heart", "Tokyo");

		System.out.println("Welcome " + gdoctor1.getName());
		gdoctor1.fastDiagnose();
		gdoctor1.performSurgery();

		Doctor gdoctor2 = new GuestDoctor("Robert", 34, 355563563, "Liver", "Paris");

		System.out.println("Welcome " + gdoctor1.getName());
		System.out.println("wearing a tie :  " + gdoctor2.IsWearingATie);
		
		((GuestDoctor) gdoctor2).fastDiagnose();
		gdoctor2.performSurgery();
		
		System.out.println("Doctor's advice :  " + gdoctor2.advice() ); // 1 week or 1 day rest? 

	}

}
