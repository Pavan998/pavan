package com.vehicle;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="dept6")
public class Department5 {
	@Id
	@GeneratedValue//it is to generate the primary key value automatically
	@Column(name="DEPTNO")
	private int departmentNumber;
	@Column(name="DNAME",length = 10)
	private String departmentName;
	@Column(name="LOC",length = 10)
	private String departmentLocation;
	
	
	public Department5() {
		super();
		System.out.println("Department is called");
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}


	@Override
	public String toString() {
		return "Department [departmentNumber=" + departmentNumber + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + "]";
	}

	
	
	
	
}
