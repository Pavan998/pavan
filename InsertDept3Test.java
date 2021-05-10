package shoppingProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Dept3;
 
public class InsertDept3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		SessionFactory sessionFactory =
			    new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//
		System.out.println("sessionFactory : "+sessionFactory);
		
		Session session = sessionFactory.getCurrentSession();
		System.out.println("session        : "+session);
		
		session.getTransaction().begin();
	
			Dept3 deptObj = new Dept3();
			/* deptObj.setDepartmentNumber(60); */
			deptObj.setDepartmentName("QMS");
			deptObj.setDepartmentLocation("Chennai");
			
			session.save(deptObj); //will fire the insert query
			
		System.out.println("Commiting...");
		session.getTransaction().commit();
		
		System.out.println("Committed...");
		
	}

}
