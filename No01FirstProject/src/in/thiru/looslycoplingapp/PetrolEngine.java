package in.thiru.looslycoplingapp;
//c c  = extends
//i c  = implements
public class PetrolEngine implements IEngine{

	@Override
	public int start() {
		System.out.println("PetrolEngine :: started");
		return 1;
	}
	
	

}
