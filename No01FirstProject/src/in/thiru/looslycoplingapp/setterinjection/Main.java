package in.thiru.looslycoplingapp.setterinjection;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.setEngine(new PetrolEngine());

		car.drive();

	}

}
