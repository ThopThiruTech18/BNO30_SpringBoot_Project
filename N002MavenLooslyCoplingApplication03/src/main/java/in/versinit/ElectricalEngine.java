package in.versinit;

public class ElectricalEngine implements IEngine{
	
	public ElectricalEngine() {
		System.out.println("ElectricalEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("ElectricalEngine started..");
		return 1;
	}
}
