import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehicle.Car;
import com.vehicle.FlightEnquiry;

public class SpringTest2 {

	public static void main(String[] args) {
		System.out.println("Welcome to spring");
		
		@SuppressWarnings("resource")
		ApplicationContext myContainer = new ClassPathXmlApplicationContext("mySpring.xml");
		
		  FlightEnquiry f = (FlightEnquiry) myContainer.getBean("fe"); 
		  f.getAvailableFlights("MUMBAI", "LONDON");
		 
		 
	}

}
