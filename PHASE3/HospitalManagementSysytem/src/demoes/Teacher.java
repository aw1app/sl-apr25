package demoes;

public class Teacher {
	
	String name;
	
	int age;
	
	final int phoneNumberOfUniversity = 220090001;
	

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	final public void m3() {
		System.out.println("INSIDE m3() of class Teacher.");
	}

}
