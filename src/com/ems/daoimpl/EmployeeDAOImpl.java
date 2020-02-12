package com.ems.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
import com.ems.main.EmployeeManagement;
//import com.pms.main.ProductManagement;

public class EmployeeDAOImpl implements EmployeeDAO{
	Scanner sc=new Scanner(System.in);
	static List<Employee> employees = new ArrayList<Employee>();
	static List<Employee> tempList = new ArrayList<Employee>();
	Employee emp=null;
	@Override
	public void addEmployee() {
		int i=1;
		while(i==1)
		{
			emp = new Employee();
			System.out.println("Enter Employee Id Number ?");
			emp.setEid(sc.nextInt());
			System.out.println("Enter Employee  Name ?");
			emp.setEname(sc.next());
			System.out.println("Enter Employee Eage ?");
			emp.setEage(sc.nextInt());
			System.out.println("Enter Employee Department ?");
			emp.setEdept(sc.next());
			System.out.println("enter Employee salary ?");
			emp.setSalary(sc.nextDouble());
			System.out.println("enter Employee leaves ?");
			emp.setLeaves(sc.nextInt());
			employees.add(emp);
			System.out.println("Do you want to add more product press 1 else any number?");
			i = sc.nextInt();
			
		}
		System.out.println("Successfully Employees added...");
		
	}

	@Override
	public Employee viewEmployee(int eid) {
		Employee e = new Employee();
		for(Employee e1:employees)
		{
			if(e1.getEid()==eid)
			{
				e=e1;
				break;
			}
		}
		return e;
	}

	@Override
	public List<Employee> viewAllEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public void updateEmployee(int eid) {
		tempList = new ArrayList<Employee>();
		for(Employee e2:employees)
		{
			if(e2.getEid()==eid)
			{
				System.out.println("Select Your Choice 1.Name 2.age  3.dept 4.salary 5.leaves");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter Updated Employee Name ?");
				       e2.setEname(sc.next());
				       break;
				case 2:System.out.println("Enter Updated Employee age ?");
				       e2.setEage(sc.nextInt());
				       break;
				case 3:System.out.println("Enter Updated Employee dept ?");
				       e2.setEdept(sc.next());
				       break;
				case 4:System.out.println("Enter Updated Employee salary ?");
				       e2.setSalary(sc.nextInt());
				       break;
				case 5:System.out.println("Enter Updated Employee leaves ?");
				       e2.setLeaves(sc.nextInt());
				       break;
				default:System.out.println("Please select your choice range 1-3 only");       
				}
				tempList.add(e2);
			}else{
				tempList.add(e2);
			}
		}
		employees = new ArrayList<Employee>();
		for(Employee e3:tempList)
		{
			employees.add(e3);
		}
		System.out.println("Successfull Employee Updated....");
		
	}

	@Override
	public void deleteEmployee(int eid) {
		tempList =new ArrayList<Employee>();
		for(Employee e4:employees) {
			if(e4.getEid()==eid) {
				
			}else {
				tempList.add(e4);
			}
		}
		employees = new ArrayList<Employee>();
		for(Employee e4:tempList) {
			employees.add(e4);
		}
		System.out.println("successfully employee deleted");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		EmployeeManagement.main(null);
	}

	@Override
	public void updateEmployeeName(int  eid) {
		// TODO Auto-generated method stub
		tempList =new ArrayList<Employee>();
		for(Employee e:employees)
		{
			if(e.getEid()==eid) {
				System.out.println("Enter the name you wanted ?");
				e.setEname(sc.next());
				tempList.add(e);
			}else{
				tempList.add(e);
			}
		}
	}

	@Override
	public void LeavesApply(int eid) {
		tempList = new ArrayList<Employee>();
		for(Employee e:employees)
		{
			if(e.getEid()==eid)
			{
				System.out.println("Enter leaves you want?");
				       int se=sc.nextInt();
			// System.out.println("enter number of leaves you wanted");
				       int ge=e.getLeaves();
				       int re=ge-se;
				       if(re>0)
				       {
				       e.setLeaves(re);
				System.out.println("your leave is granted ");
				System.out.println("you are left with "+re+" leaves");
				       }
				       else {
				       try {
						throw new Exception("you reached your leave limit");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				       }tempList.add(e);
			}else{
				tempList.add(e);
			}
	}
	}

}
