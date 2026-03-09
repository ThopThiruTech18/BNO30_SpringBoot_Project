package in.thiru.looslycoplingapp.ciseboth;

public class Car {

	public Car() {
		System.out.println("Car :: Constructor");
	}

	IEngine engine;

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public Car(IEngine engine) {
		this.engine = engine;
	}

	public void drive() {
		int start = engine.start();

		if (start > 0) {
			System.out.println("Car Driving started");
		} else {
			System.out.println("Car Driving not started");
		}
	}

}
