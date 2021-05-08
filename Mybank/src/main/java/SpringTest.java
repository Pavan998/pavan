import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vehicle.Car;

public class SpringTest {

	public static void main(String[] args) {
		System.out.println("Welcome to spring");
		/*
		 * Piston p =new Piston(); 
		 * Engine e = new Engine(p); 
		 * Car c = new Car(e);
		 * c.startCar();
		 */
		@SuppressWarnings("resource")
		ApplicationContext myContainer = new ClassPathXmlApplicationContext("mySpring.xml");
		
		  Car c2 = (Car) myContainer.getBean("myCar2"); 
		  c2.startCar();
		 
		 
	}

}
