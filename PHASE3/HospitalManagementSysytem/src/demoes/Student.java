package demoes;

public class Student {
	
	String name;
	
	static int x = 10;
	
	static int counter =0;
	
	
	public Student(String name) {
		super();
		this.name = name;
		
		counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getX() {
		return x;
	}

	public static void setX(int x) {
		Student.x = x;
	}
	
	
	static int getCounter() {
		return counter;
	}
	
	

}
