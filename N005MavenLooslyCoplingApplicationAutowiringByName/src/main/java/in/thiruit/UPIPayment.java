package in.thiruit;
//in.thiruit.UPIPayment
public class UPIPayment implements IPaymentType{
	
	public UPIPayment() {
		System.out.println("UPIPayment :: Constructor");
	}

	
	@Override
	public boolean pay(double amount) {
		System.out.println("UPIPayment started..");
		return true;
	}

}
