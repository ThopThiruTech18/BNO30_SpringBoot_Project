package in.thiruit;

public class PaymentProcess {

	IPaymentType payType;
//	int a;

	public PaymentProcess() {
		System.out.println("PaymentProcess :: Constructor");
	}

	public PaymentProcess(IPaymentType payType)
	{
		this.payType=payType;
	}

	public void setPayType(IPaymentType payType)
	{
		this.payType = payType;
	}

	public void payment(double amount) {
		boolean payStatus = payType.pay(amount);

		if (payStatus) {
			System.out.println("Payment Success");
		} else {
			System.out.println("Payment Failed");
		}
	}

}
