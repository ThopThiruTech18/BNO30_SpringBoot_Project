package in.versinit;

//in.versinit.Car
public class Car {

	IEngine engine;

	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public Car(IEngine eng)
	{
		this.engine=eng;
	}

	public void drive() {
		int status = engine.start();

		if (status > 0) {
			System.out.println("Journey started...");
		} else {
			System.out.println("Journey not started...");
		}
	}

}
