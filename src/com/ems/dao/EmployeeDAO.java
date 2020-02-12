package com.ems.dao;

import java.util.List;

import com.ems.bean.Employee;


public interface EmployeeDAO {
	public void addEmployee();
	public Employee viewEmployee(int eid);
	public  List<Employee> viewAllEmployee();
	public void updateEmployee(int eid);
	public void updateEmployeeName(int eid);
	public void deleteEmployee(int eid);
	public void back();
	public void LeavesApply(int eid);
}
