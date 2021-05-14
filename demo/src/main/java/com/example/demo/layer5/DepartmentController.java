package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Department5;
import com.example.demo.layer4.DepartmentService;

@RestController  //REpresentational State Transfer html xml json
public class DepartmentController {

	@Autowired
	DepartmentService deptServ;
	
	@GetMapping(path="/getDept")
	@ResponseBody
	public Department5 getDepartment() {
		System.out.println("Department Controller....Understanding client and talking to service layer...");
		Department5 dept = deptServ.findDepartmentService(10);
		return dept;
		
	}
	
	
	@GetMapping(path="/getDepts")
	@ResponseBody
	public List<Department5> getAllDepartments() {
		System.out.println("Department Controller....Understanding client and talking to service layer...");
		List<Department5> deptList = deptServ.findDepartmentsService();
		return deptList;
		
	}
	
	
	
}
