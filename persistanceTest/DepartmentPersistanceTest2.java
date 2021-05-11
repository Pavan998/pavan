package com.vehicle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mySpring.xml")
public class DepartmentPersistanceTest2 {
	@Autowired
	DepartmentRepository dri;
	
	@Test
	public void testInsertNewDept() {
		Department5 dept = new Department5();
		dept.setDepartmentName("COADING");dept.setDepartmentLocation("CHENNAI");
		dri.addDepartment(dept);
		
		
	}

}
