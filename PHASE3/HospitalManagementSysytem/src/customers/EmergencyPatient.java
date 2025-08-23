package customers;

public class EmergencyPatient extends Patient {

	protected int criticalLevel;

	public EmergencyPatient(String name, int age, int criticalLevel) {
		super(name, age);
		this.criticalLevel = criticalLevel;
		
	}

	public void Criticality(int criticalLevel) {
		System.out.println("Patient name : " + this.age + "criticallevel : " + criticalLevel);
	}

}