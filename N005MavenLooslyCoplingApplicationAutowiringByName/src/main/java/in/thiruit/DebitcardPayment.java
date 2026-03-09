package in.thiruit;

public class DebitcardPayment implements IPaymentType{
	
	public DebitcardPayment() {
		System.out.println("DebitcardPayment :: Constructor");
	}
	
	@Override
	public boolean pay(double amount) {
		System.out.println("DebitcardPayment started..");
		return true;
	}

}
