package in.thiru.looslycoplingapp;

public class Car {

	IEngine engine;

	public void setEngine(IEngine engine) {
		this.engine = engine;
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
