package com.reg;

public class Employee {
	String empid;
	String empname;
	String empdesign;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesign() {
		return empdesign;
	}
	public void setEmpdesign(String empdesign) {
		this.empdesign = empdesign;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + empid + ", Empname=" + empname + ", Empdesign=" + empdesign + "]";
	}
	
}
