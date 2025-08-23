package staff;

public class Professor implements IProfessor{

	@Override
	public void lecture() {
		System.out.println(" Listen to my lecture ...");
		
	}

	@Override
	public void guideThesis() {
		System.out.println(" I am your guide for your thesis");		
	}

}
