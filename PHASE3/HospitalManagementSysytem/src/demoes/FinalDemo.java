package demoes;

public class FinalDemo {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Sree Pal", 30);
		
		t1.name  = "Prakash";
		t1.age  = 50;
		t1.m3();
		
		// t1.phoneNumberOfUniversity = 000000000;
		
		
		PartTimeTeacher pt1 = new PartTimeTeacher("Sree Pal", 30);
		pt1.m3();

	}

}
