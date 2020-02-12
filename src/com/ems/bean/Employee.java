package com.ems.bean;

public class Employee {
public Employee(int eid, String ename, int eage, String edept, double salary,int leaves) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
		this.edept = edept;
		this.salary = salary;
		this.leaves=leaves;
	}
public Employee()
{
	
}
@Override
	public String toString() {
		return   eid + "\t" + ename + "\t" + eage + "\t" + edept + "\t"
				+ salary +"\t"+leaves;
	}
public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
private int eid;
private String ename;
private int eage;
private String edept;
private double salary;
private int leaves;
public int getLeaves() {
	return leaves;
}
public int setLeaves(int leaves) {
	 return this.leaves = leaves;
}
}
