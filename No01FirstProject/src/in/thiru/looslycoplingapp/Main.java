package in.thiru.looslycoplingapp;

public class Main {
	
	public static void main(String[] args) {
		
		
		Car car=new Car();
		
		
		PetrolEngine petrol=new PetrolEngine();
		DieselEngine diesel=new DieselEngine();
		car.setEngine(petrol);
		car.drive();
		
	}

}
