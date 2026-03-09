package in.thiru.looslycoplingapp.ciseboth;

public class ElectricalEngine implements IEngine {

	public ElectricalEngine() {
		System.out.println("ElectricalEngine :: Constructor");
	}

	@Override
	public int start() {
		
		
		System.out.println("ElectricalEngine Started....");
		
		return 1;
	}
	
	
	
	

}
