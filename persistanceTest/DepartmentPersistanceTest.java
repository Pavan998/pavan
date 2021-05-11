package com.vehicle;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DepartmentPersistanceTest {
	
	@Test
	public void testInsertNewDept() {
		ApplicationContext myContainer = new ClassPathXmlApplicationContext("mySpring.xml");
		DepartmentRepository dri =(DepartmentRepository) myContainer.getBean("deptRepo" );
		Department5 dept = new Department5();
		
		dept.setDepartmentName("QMS");
		dept.setDepartmentLocation("MUMBAI");
		dri.addDepartment(dept);
		
		
	}

}
