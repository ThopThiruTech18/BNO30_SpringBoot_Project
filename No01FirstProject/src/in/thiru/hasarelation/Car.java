package in.thiru.hasarelation;

public class Car {
	
	public Car() {
		System.out.println("Car :: Constroctor");
	}

	public void drive() {
		
		
		Engine engine=new Engine();
		int start = engine.start();
		
		if(start > 0)
		{
			System.out.println("Car Driving started");
		}

	}

}
