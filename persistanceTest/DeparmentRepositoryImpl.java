package com.vehicle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("deptRepo")
public class DeparmentRepositoryImpl implements DepartmentRepository {//isA
	
	//hasA
	@PersistenceContext(unitName="MyAirlineProject" )
	private EntityManager entityManager;//auto injected by spring by reading 
										//persistance.xml file
	
	@Transactional//no need of begin transaction and commit rollback
	public void addDepartment(Department5 dRef) {//usesA
		entityManager.persist(dRef);

	}
	
	@Transactional
	public Department5 findDepartment(int dno) {//producesA Department obj
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Department5> findDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void modifyDepartment(Department5 dRef) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void removeDepartment(Department5 dRef) {
		// TODO Auto-generated method stub

	}

}
