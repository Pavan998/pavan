package shoppingProject;

import com.departmentdao.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee;
 
public class SelectObjectTest2 {

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
		   
			Department deptObj = new Department();
			DepartmentDAOImpl ddiObj =new DepartmentDAOImpl();
			
			List<Department> deptList = ddiObj.findDepartments();
				
			Iterator<Department> deptIter = deptList.iterator();
			
			while(deptIter.hasNext()) {
					deptObj = deptIter.next();
					System.out.println("---------Department--------");
					System.out.println("Dno     : "+deptObj.getDepartmentNumber());
					System.out.println("Dname   : "+deptObj.getDepartmentName());
					System.out.println("loc     : "+deptObj.getDepartmentLocation());
					System.out.println("*************************");
				List<Employee> myemps = deptObj.getEmplist();
				Iterator<Employee> iter = myemps.iterator();
				while(iter.hasNext()) {
				Employee empObj = iter.next();
				System.out.println("Empno     : "+empObj.getEmployeeNumber());
				System.out.println("Ename     : "+empObj.getEmployeeName());
				System.out.println("Job       : "+empObj.getEmployeeJob());
				System.out.println("MANAGER   : "+empObj.getEmployeeManager());
				System.out.println("HIREDATE  : "+empObj.getEmployeeHiredate());
				System.out.println("SALARY    : "+empObj.getEmployeeSalary());
				System.out.println("COMMETION : "+empObj.getEmployeeCommission());
				System.out.println("--------------------");
			}
		}
			
		System.out.println("Commiting...");
		session.getTransaction().commit();
		
		System.out.println("Committed...");
		
	}

}
