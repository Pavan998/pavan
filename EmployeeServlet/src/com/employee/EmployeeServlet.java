package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SerVlet implementation class EmployeeServeet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 EmployeeDAOImpl ediObj;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        System.out.println("Employee servlet");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		 System.out.println("init...");
		 ediObj = new EmployeeDAOImpl();
		 
		 
		 
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		 System.out.println("\t\tdestroy....");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("\tservice....");
		 PrintWriter pw =response.getWriter();
		 pw.println("<h2>Welcome to Employee Portal</h2>");
		 pw.println("<a href ='http://localhost:8080/EmployeeServlet/'> Home</a>");
	List<Employee> empList =ediObj.findEmployees(); 
	Iterator<Employee> iter  = empList.iterator();
	pw.println("<table border=5>");
	while(iter.hasNext()) {
		Employee e = iter.next();
		pw.println("<tr>");
		pw.println("<td>Employee Number</td><td>"+e.getEmployeeNumber()+"</td>");
		pw.println("</tr>");
	}
	pw.println("</table>");
	}

}
class Employee{//pojo same as employee structure
	private int employeeNumber;
	private String employeeName;
	private String employeeJob;
	private int employeeManager;
	private String emplyoyeeHireDate;
	private int employeeSalary;
	private int employeeCommetion;
	private int employeeDeptno;
	//setter and getter
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public int getEmployeeManager() {
		return employeeManager;
	}
	public void setEmployeeManager(int employeeManager) {
		this.employeeManager = employeeManager;
	}
	public String getEmplyoyeeHireDate() {
		return emplyoyeeHireDate;
	}
	public void setEmplyoyeeHireDate(String emplyoyeeHireDate) {
		this.emplyoyeeHireDate = emplyoyeeHireDate;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeCommetion() {
		return employeeCommetion;
	}
	public void setEmployeeCommetion(int employeeCommetion) {
		this.employeeCommetion = employeeCommetion;
	}
	public int getEmployeeDeptno() {
		return employeeDeptno;
	}
	public void setEmployeeDeptno(int employeeDeptno) {
		this.employeeDeptno = employeeDeptno;
	}
	
	
	
}

interface EmployeeDAO{
	void addEmployee(Employee eRef);    //C - add/create
	Employee findEmployee(int eno);     //R - find/reading
	List<Employee> findEmployees();     //R - find all/reading all
	List<Employee> findEmployee(String x);
	void modifyEmployee(Employee eRef); //U - modify/update
	void removeEmployee(Employee eRef); //D - remove/delete
	void removeEmployee(); 
	
}

class EmployeeDAOImpl implements EmployeeDAO
{
	Connection conn;
	ResultSet rs;
	Statement st;
	PreparedStatement pst;
	
	EmployeeDAOImpl(){
		try {
			System.out.println("Trying to Load Driver");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver Loaded.......");
			
			System.out.println("Trying to Connect with Database...");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "manager");
			System.out.println("Connected to Database....");
		}
		catch(Exception e){
			System.out.println("some problem");
		}
	}
	public void addEmployee(Employee eRef) {
		//C - add/create
		try {
			System.out.println("Trying to make a PreparedStatment...");
			PreparedStatement pst = conn.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
						
			pst.setInt(1, eRef.getEmployeeNumber()); 
			pst.setNString(2, eRef.getEmployeeName());
			pst.setNString(3, eRef.getEmployeeJob());
			pst.setInt(4,eRef.getEmployeeManager());
			pst.setNString(5, eRef.getEmplyoyeeHireDate());
			pst.setInt(6, eRef.getEmployeeSalary());
			pst.setInt(7, eRef.getEmployeeCommetion());
			pst.setInt(8, eRef.getEmployeeDeptno());
			System.out.println("PreparedStatement made....for DML");
					
			System.out.println("Trying to fire it... ");
			int rows = pst.executeUpdate();
			System.out.println("Rows Inserted...."+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Employee findEmployee(int eno) {
		//R - find/reading
		Employee empobj=null;
		
		try {
			System.out.println("Trying to make a Statment...");
			st = conn.createStatement();
			System.out.println("Statement made....for DQL");
			 
			System.out.println("Trying to write a query and fire it... ");
			rs = st.executeQuery("select * from emp where empno = "+eno);
			System.out.println("Query fired...and got the result....");
			
			System.out.println("Now processing the result.....");
			if(rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				int d = rs.getInt(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				int h = rs.getInt(8);
				
				empobj = new Employee();
				empobj.setEmployeeNumber(a);
				empobj.setEmployeeName(b);
				empobj.setEmployeeJob(c);
				empobj.setEmployeeManager(d);
				empobj.setEmplyoyeeHireDate(e);
				empobj.setEmployeeSalary(f);
				empobj.setEmployeeCommetion(g);
				empobj.setEmployeeDeptno(h);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empobj;
	}
	public  List<Employee> findEmployees(int deptno) {
		//R - find/reading
		List<Employee> empList=new ArrayList<Employee>();
		
		try {
			System.out.println("Trying to make a Statment...");
			st = conn.createStatement();
			System.out.println("Statement made....for DQL");
			 
			System.out.println("Trying to write a query and fire it... ");
			rs = st.executeQuery("select * from emp where deptno = "+deptno);
			System.out.println("Query fired...and got the result....");
			
			System.out.println("Now processing the result.....");
			while(rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				int d = rs.getInt(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				int h = rs.getInt(8);
				
				Employee empobj = new Employee();
				empobj.setEmployeeNumber(a);
				empobj.setEmployeeName(b);
				empobj.setEmployeeJob(c);
				empobj.setEmployeeManager(d);
				empobj.setEmplyoyeeHireDate(e);
				empobj.setEmployeeSalary(f);
				empobj.setEmployeeCommetion(g);
				empobj.setEmployeeDeptno(h);
				
				empList.add(empobj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	public  List<Employee> findEmployees(String Job) {
		//R - find/reading
		Employee empobj = new Employee();
		List<Employee> empList=new ArrayList<Employee>();
		try {
			System.out.println("Trying to make a Statment...");
			st = conn.createStatement();
			System.out.println("Statement made....for DQL");
			 
			System.out.println("Trying to write a query and fire it... ");
			rs = st.executeQuery("select * from emp where job ="+"'"+Job+"'");
			System.out.println("Query fired...and got the result....");
			
			System.out.println("Now processing the result.....");
			while(rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				int d = rs.getInt(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				int h = rs.getInt(8);
				
				empobj = new Employee();
				empobj.setEmployeeNumber(a);
				empobj.setEmployeeName(b);
				empobj.setEmployeeJob(c);
				empobj.setEmployeeManager(d);
				empobj.setEmplyoyeeHireDate(e);
				empobj.setEmployeeSalary(f);
				empobj.setEmployeeCommetion(g);
				empobj.setEmployeeDeptno(h);
				
				empList.add(empobj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	public  List<Employee> findEmployee(String dt) {
		//R - find/reading
		//LocalDate t=new LocalDate.of(date,month,year)
		//		LocalDate t=new localDate.of(26,08,2021)
		
		Employee empobj = new Employee();
		List<Employee> empList=new ArrayList<Employee>();
		try {
			System.out.println("Trying to make a Statment...");
			st = conn.createStatement();
			System.out.println("Statement made....for DQL");
			 
			System.out.println("Trying to write a query and fire it... ");
			rs = st.executeQuery("select * from emp where hiredate ="+"'"+dt+"'");
			System.out.println("Query fired...and got the result....");
			
			System.out.println("Now processing the result.....");
			while(rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				int d = rs.getInt(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				int h = rs.getInt(8);
				
				empobj = new Employee();
				empobj.setEmployeeNumber(a);
				empobj.setEmployeeName(b);
				empobj.setEmployeeJob(c);
				empobj.setEmployeeManager(d);
				empobj.setEmplyoyeeHireDate(e);
				empobj.setEmployeeSalary(f);
				empobj.setEmployeeCommetion(g);
				empobj.setEmployeeDeptno(h);
				
				empList.add(empobj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	public List<Employee> findEmployees(){
		//R - find all/reading all
		List<Employee> empList=new ArrayList<Employee>();
		try {
			System.out.println("Trying to make a Statment...");
			st = conn.createStatement();
			System.out.println("Statement made....for DQL");
			 
			System.out.println("Trying to write a query and fire it... ");
			rs = st.executeQuery("select * from emp");
			System.out.println("Query fired...and got the result....");
			
			System.out.println("Now processing the result.....");
			while(rs.next()) {
				int a = rs.getInt(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				int d = rs.getInt(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				int h = rs.getInt(8);
				
				Employee empobj = new Employee();
				empobj.setEmployeeNumber(a);
				empobj.setEmployeeName(b);
				empobj.setEmployeeJob(c);
				empobj.setEmployeeManager(d);
				empobj.setEmplyoyeeHireDate(e);
				empobj.setEmployeeSalary(f);
				empobj.setEmployeeCommetion(g);
				empobj.setEmployeeDeptno(h);
				
				empList.add(empobj);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}
	public void modifyEmployee(Employee eRef) {
		//U - modify/update
		try {
			System.out.println("Trying to make a PreparedStatment...");
			PreparedStatement pst = conn.prepareStatement("update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?");
					
			pst.setNString(1, eRef.getEmployeeName());
			pst.setNString(2, eRef.getEmployeeJob());
			pst.setInt(3, eRef.getEmployeeManager());
			pst.setNString(4, eRef.getEmplyoyeeHireDate());
			pst.setInt(5, eRef.getEmployeeSalary());
			pst.setInt(6, eRef.getEmployeeCommetion());
			pst.setInt(7, eRef.getEmployeeDeptno());
			pst.setInt(8, eRef.getEmployeeNumber());
			
			System.out.println("PreparedStatement made....for DML");
			
			System.out.println("Trying to fire it... ");
			int rows = pst.executeUpdate();
			System.out.println("Rows Updated...."+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void removeEmployee(Employee eRef) {
		//D - remove/delete
		try {
			System.out.println("Trying to make a PreparedStatment...");
			PreparedStatement pst = conn.prepareStatement("delete from emp where empno=?");
			
			pst.setInt(1, eRef.getEmployeeNumber()); 
			System.out.println("PreparedStatement made....for DML");
			
			System.out.println("Trying to fire it... ");
			int rows = pst.executeUpdate();
			System.out.println("Rows Deleted...."+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("resource")
	public void removeEmployee() {
		//D - remove/delete
		int deptno;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter deptno: ");
		deptno=scan.nextInt();
		try {
			System.out.println("Trying to make a PreparedStatment...");
			PreparedStatement pst = conn.prepareStatement("delete from emp where deptno="+deptno);
			
			System.out.println("PreparedStatement made....for DML");
			
			System.out.println("Trying to fire it... ");
			int rows = pst.executeUpdate();
			System.out.println("Rows Deleted...."+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void removeEmployee( String job) {
		//D - remove/delete
		try {
			System.out.println("Trying to make a PreparedStatment...");
			PreparedStatement pst = conn.prepareStatement("delete from emp where job=?");
			pst.setString(1,job);
			System.out.println("PreparedStatement made....for DML");
			
			System.out.println("Trying to fire it... ");
			int rows = pst.executeUpdate();
			System.out.println("Rows Deleted...."+rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}