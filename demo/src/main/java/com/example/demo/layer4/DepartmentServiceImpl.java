package com.example.demo.layer4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.Department5;
import com.example.demo.layer3.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
		
	@Autowired
	DepartmentRepository deptRepo;
	
	@Override
	public void addDepartmentService(Department5 dRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department5 findDepartmentService(int dno) {
		System.out.println("Department Service....Some scope of bussiness logic here...");
		return deptRepo.findDepartment(dno);
	}

	@Override
	public List<Department5> findDepartmentsService() {
		System.out.println("Department Service....Some scope of bussiness logic here...");
		return deptRepo.findDepartments();
	}

	@Override
	public void modifyDepartmentService(Department5 dRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDepartmentService(int dno) {
		// TODO Auto-generated method stub

	}

}
