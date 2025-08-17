
public class HMSMain {

	public static void main(String[] args) {
		
		Doctor doctor1 = new Doctor(); // doctor class object
		doctor1.name = "Madan";
		doctor1.age = 45;
		doctor1.licenseNumber = 345345346;
		doctor1.specialist = "Cardiac Surgeon";
		
		System.out.println("Doctor 1 details :  "+doctor1.toString());
		
		String docAdvice = doctor1.advice();
		System.out.println("Advice from doctor 1:  "+docAdvice);
		
		Doctor doctor2 = new Doctor("Mohini", 47); // doctor class object		
		doctor2.licenseNumber = 56565656;
		doctor2.specialist = "Dental";
		
		System.out.println("Doctor 2 details :  "+doctor2);
		
		String docAdvice2 = doctor2.advice();
		System.out.println("Advice from doctor 2:  "+docAdvice2);
		
		
		Doctor doctor3 = new Doctor("Suman", 41, 343434535, "Dental" ) ;
		String docAdvice3 = doctor3.advice();
		
		System.out.println("Doctor 3 details :  "+doctor3);
		System.out.println("Advice from doctor 3:  "+docAdvice3);
		
		Patient patient1 = new Patient();
		patient1.age=21;
		patient1.name="Mohan";
		patient1.disease="toothache";
		
		patient1.bookAppointment(doctor2);
		
		//TASK-1: Create a Technican and let that technician do some activity
		Technician technician = new Technician();
		technician.name="ravi";
		technician.age=32;
		technician.department="electrical work";
		technician.shift="night";
		
		technician.maintainEquipment();
		

	}

}
