package in.thiruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
		
		PaymentProcess pay1 = context.getBean(PaymentProcess.class);
		PaymentProcess pay2 = context.getBean(PaymentProcess.class);
		PaymentProcess pay3 = context.getBean(PaymentProcess.class);
		PaymentProcess pay4 = context.getBean(PaymentProcess.class);
		
		System.out.println(pay1.hashCode());
		System.out.println(pay2.hashCode());
		System.out.println(pay3.hashCode());
		System.out.println(pay4.hashCode());
	
		
//		bean.payment(5000);
		
	}

}
