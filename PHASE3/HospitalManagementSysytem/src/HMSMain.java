
public class HMSMain {

	public static void main(String[] args) {
		
		Doctor doctor1 = new Doctor(); // doctor class object
		doctor1.name = "Madan";
		doctor1.age = 45;
		doctor1.licenseNumber = 345345346;
		doctor1.specialist = "Cardiac Surgeon";
		
		String docAdvice = doctor1.advice();
		System.out.println("Advice from doctor 1:  "+docAdvice);
		
		Doctor doctor2 = new Doctor(); // doctor class object
		doctor2.name = "Mohini";
		doctor2.age = 47;
		doctor2.licenseNumber = 56565656;
		doctor2.specialist = "Dental";
		
		
		Patient patient1 = new Patient();
		patient1.age=21;
		patient1.name="Mohan";
		patient1.disease="toothache";
		
		patient1.bookAppointment(doctor2);
		
		//TASK-1: Create a Technican and let that technician do some activity

	}

}
