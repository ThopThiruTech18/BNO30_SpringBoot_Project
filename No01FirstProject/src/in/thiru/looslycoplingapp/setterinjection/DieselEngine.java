package in.thiru.looslycoplingapp.setterinjection;

public class DieselEngine implements IEngine{

	public DieselEngine() {
		System.out.println("DieselEngine :: Construcotor");
	}
	
	
	
	@Override
	public int start() {
		
		System.out.println("DieselEngine :: started");
	
		return 1;
	}

}
