package in.versinit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println("Started Main method");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		
		Car carObject = context.getBean(Car.class);
		
		
		carObject.drive();
		
		System.out.println("Ended Main method");
		
		
	}

}
