package in.thiruit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

		PaymentProcess pay1 = context.getBean(PaymentProcess.class);

		pay1.payment(5000);

	}

}
