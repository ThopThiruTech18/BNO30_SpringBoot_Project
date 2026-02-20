package in.thiru.hasarelation1;

public class Car {

	public void drive() {
		DieselEngine diesel = new DieselEngine();
		diesel.start();

		PetrolEngine petrol = new PetrolEngine();
		petrol.start();

		ElectricalEngine electrical = new ElectricalEngine();
		electrical.start();

	}

}
