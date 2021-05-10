package shoppingProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.pojo.Department5;

/*import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;*/


public class InsertDeptJpaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// SessionFactory sessionFactory =
		// new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hibernate-JPA"); // META-INF/persistence.xml
		//same as hibernate session factory
		System.out.println("Entity Manager Factory : " + entityManagerFactory);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//same as hibernate session
		// Session session = sessionFactory.getCurrentSession();
		System.out.println("entity manager        : " + entityManager);
		
		 EntityTransaction tx = entityManager.getTransaction();
		 //same as hibernate transaction
		Department5 deptObj = new Department5();
		//deptObj.setDepartmentNumber(60); 
		deptObj.setDepartmentName("QMS");
		deptObj.setDepartmentLocation("Chennai");
		tx.begin();
		entityManager.persist(deptObj); // same as session.save()

		System.out.println("Commiting...");
		tx.commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Committed...");

	}

}
