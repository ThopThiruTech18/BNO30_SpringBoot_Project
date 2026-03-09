package in.thiruit;

public class CreditCardPayment implements IPaymentType {
	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}

	@Override
	public boolean pay(double amount) {
		System.out.println("CreditCardPayment started..");
		return true;
	}

}
