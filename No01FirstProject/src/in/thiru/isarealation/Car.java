package in.thiru.isarealation;

public class Car extends Engine {

	public void drive() {
		boolean start = super.start();

		if (start) {
			System.out.println("Car driving started");
		}

	}

}
