package in.thiru.looslycoplingapp.constructor;

public class Car {
	
	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	
	

	IEngine engine;

//	public void setEngine(IEngine engine) {
//		this.engine = engine;
//	}
	
	public Car(IEngine engine)
	{
		this.engine=engine;
	}

	public void drive() {
		int start = engine.start();

		if (start > 0) {
			System.out.println("Car :: driving started");
		} else {
			System.out.println("Car :: failed to start the driving");
		}
	}

}
