package in.versinit;

//in.versinit.Car
public class Car {

	IEngine eng;

	public Car() {
		System.out.println("Car :: Constructor");
	}

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();

		if (status > 0) {
			System.out.println("Journey started...");
		} else {
			System.out.println("Journey not started...");
		}
	}

}
