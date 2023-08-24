package dto;

public class Employee {
	
	private int empId;
	private String empName;
	private String empAddress;
	private double salary;
	private long contact;
	private int deptid;
	
	public Employee() {}
	
	public Employee(int empId, String empName, String empAddress, double salary, long contact, int deptid) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.salary = salary;
		this.contact = contact;
		this.deptid = deptid;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpAddress() {
		return this.empAddress;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public long getContact() {
		return this.contact;
	}
	
	public void setDeptId(int deptid) {
		this.deptid = deptid;
	}
	
	public int getDeptId() {
		return this.deptid;
	}
}
