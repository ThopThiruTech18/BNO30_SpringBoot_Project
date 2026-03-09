package in.versinit;

public class DieselEngine implements IEngine{
	
	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public int start() {
		System.out.println("DieselEgine started..");
		return 1;
	}

}
