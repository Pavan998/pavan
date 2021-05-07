package shoppingProject;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.junit.Test;

import com.pojo.Customer;
import com.pojo.Subscription;
import com.myshopping.util.MyFactory;

public class CustomerSubscriptionTest {

	@Test
	public void testAddCustomer() {
		MyFactory factory = new MyFactory();
		Session session = factory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println("test case 1");
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		Customer cust3 = new Customer();
		
		cust1.setId(101);
		cust1.setName("Nisarga");
		cust1.setEmail("n@gmail.com");
		
		cust2.setId(102);
		cust2.setName("Deepika");
		cust2.setEmail("d@gmail.com");
		
		cust3.setId(103);
		cust3.setName("Medha");
		cust3.setEmail("m@gmail.com");
		
		session.save(cust1);
		session.save(cust2);
		session.save(cust3);
		session.beginTransaction().commit();
	}
	
	@Test
	public void testAddSubscriptions() {
		MyFactory factory = new MyFactory();
		Session session = factory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println("test case 2");
		Subscription sub1 = new Subscription();
		Subscription sub2 = new Subscription();
		Subscription sub3 = new Subscription();
		Subscription sub4 = new Subscription();
		
		sub1.setId(501);
		sub1.setType("Book");
		sub1.setDuration(3);
		
		sub2.setId(502);
		sub2.setType("DVDs");
		sub2.setDuration(2);
		
		sub3.setId(503);
		sub3.setType("CDs");
		sub3.setDuration(1);
		
		sub4.setId(504);
		sub4.setType("Magazines");
		sub4.setDuration(5);
		
		
		session.save(sub1);
		session.save(sub2);
		session.save(sub3);
		session.save(sub4);
		
		session.beginTransaction().commit();
	}
	
	@Test 
	public void testAssignSubscriptionToCustomer()
	{
		MyFactory factory = new MyFactory();
		Session session = factory.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println("test case 3");
		Customer cust = session.get(Customer.class, 102);
		
		Subscription sub1 = session.get(Subscription.class, 502);
		Subscription sub2 = session.get(Subscription.class, 503);
		
		Set<Subscription> mySet = new HashSet<Subscription>();
		mySet.add(sub1);
		mySet.add(sub2);
		
		cust.setSubscriptions(mySet);
		
		session.saveOrUpdate(cust);
		session.beginTransaction().commit();
	}
}
