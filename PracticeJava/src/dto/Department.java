package dto;

public class Department {
	
	private int deptid;
	private String deptName;
	private String deptHead;
	private String deptDesc;
	
	
	public Department() {
		this.deptid = deptid;
		this.deptName = deptName;
		this.deptHead = deptHead;
		this.deptDesc = deptDesc;
	}
	
	public void setDeptId(int deptid) {
		this.deptid = deptid;
	}
	
	public int getDeptId() {
		return this.deptid;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	
	public String getDeptHead() {
		return this.deptHead;
	}
	
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	
	public String getDeptDesc() {
		return this.deptDesc;
	}
}
