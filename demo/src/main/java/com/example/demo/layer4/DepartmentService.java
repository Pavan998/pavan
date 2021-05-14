package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Department5;
@Service
public interface DepartmentService {
	void addDepartmentService(Department5 dRef);   //C - add/create
	Department5 findDepartmentService(int dno);     //R - find/reading
	List<Department5> findDepartmentsService();     //R - find all/reading all
	void modifyDepartmentService(Department5 dRef); //U - modify/update
	void removeDepartmentService(int dno); //D - remove/delete
	
	
	
}
