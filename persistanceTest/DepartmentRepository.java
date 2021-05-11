package com.vehicle;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository {//same as DeparmentDAO

	void addDepartment(Department5 dRef);   //C - add/create
	Department5 findDepartment(int dno);     //R - find/reading
	List<Department5> findDepartments();     //R - find all/reading all
	void modifyDepartment(Department5 dRef); //U - modify/update
	void removeDepartment(Department5 dRef); //D - remove/delete
	
	
}
