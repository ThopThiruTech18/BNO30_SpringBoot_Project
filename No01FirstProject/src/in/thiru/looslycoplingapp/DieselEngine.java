package in.thiru.looslycoplingapp;

public class DieselEngine implements IEngine{

	@Override
	public int start() {
		
		System.out.println("DieselEngine :: started");
	
		return 1;
	}

}
