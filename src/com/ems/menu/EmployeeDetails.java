package com.ems.menu;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.daoimpl.EmployeeDAOImpl;
//import com.pms.bean.Product;
//import com.pms.daoimpl.ProductDAOImpl;
//import com.pms.bean.Product;

public class EmployeeDetails {

	//public static void adminMenu() {
		static Scanner sc = new Scanner(System.in);
		static EmployeeDAOImpl EmployeeDAO = new EmployeeDAOImpl();

		public static void adminMenu() {
			System.out.println("-----------------------");
			System.out.println("|   ADMIN MAIN MENU   |");
			System.out.println("-----------------------");
			System.out.println("| 1.ADD EMPLOYEE      |");
			System.out.println("| 2.VIEW EMPLOYEE     |");
			System.out.println("| 3.VIEW ALL EMPLOYEE |");
			System.out.println("| 4.UPDATE EMPLOYEE   |");
			System.out.println("| 5.DELETE EMPLOYEE   |");
			System.out.println("| 6.BACK              |");
			System.out.println("-----------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				EmployeeDAO.addEmployee();
				adminMenu();
				break;
			case 2:
				System.out.println("Enter Your Search Employee Id ?");
				Employee Employee = EmployeeDAO.viewEmployee(sc.nextInt());
				System.out.println("PID" + "\t" + "PNAME" +"\t "+"EAGE" + "\t" + "DEPT"+"\t"+"SALARY"+"\t"+"LEAVES");
				System.out.println("------------------------------------");
				System.out.println(Employee);
				adminMenu();
				break;
			case 3:
				List<Employee> employees = EmployeeDAO.viewAllEmployee();
				System.out.println("PID" + "\t" + "PNAME" +"\t"+"EAGE" + "\t" + "DEPT"+"\t"+"SALARY"+"\t"+"LEAVES");
				System.out.println("------------------------------------");
				for (Employee e : employees) {
					System.out.println(e);
				}
				adminMenu();
				break;
			case 4:
				System.out.println("Enter Updating Employee Id ?");
				EmployeeDAO.updateEmployee(sc.nextInt());
				adminMenu();
				break;
			case 5:
				System.out.println("Enter Deleting  Id ?");
				EmployeeDAO.deleteEmployee(sc.nextInt());
				adminMenu();
				break;
			case 6:
				EmployeeDAO.back();
				break;
			default:
				System.out.println("Please select your choice range 1-6 only");

			}

	}
		public static void EmployeeMenu() {
			System.out.println("------------------------");
			System.out.println("|  EMPLOYEE MAIN MENU   |");
			System.out.println("------------------------");
			System.out.println("| 1.VIEW Employee       |");
			System.out.println("| 2.VIEW ALL Employees  |");
			System.out.println("| 3.Update Name         |");
			System.out.println("| 4.Leave apply         |");
			System.out.println("| 5.Back                |");
			System.out.println("-----------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Your Search Employee Id ?");
				Employee employee = EmployeeDAO.viewEmployee(sc.nextInt());
				System.out.println("EID" + "\t" + "ENAME" +"\t "+"EAGE" + "\t" + "EDEPT"+"\t"+"E_SAL"+"\t"+"E_LEAVES"+"\t");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println(employee);
				EmployeeMenu();
				break;
			case 2:
				List<Employee> employees = EmployeeDAO.viewAllEmployee();
				System.out.println("EID" + "\t" + "ENAME" +"\t "+"EAGE" + "\t" + "EDEPT"+"\t"+"E_SAL"+"\t"+"E_LEAVES");
				System.out.println("------------------------------------");
				for (Employee p : employees) {
					System.out.println(p);
				}
				EmployeeMenu();
				break;
			case 3:System.out.println("Enter Updating Employee id ?");
			EmployeeDAO.updateEmployeeName(sc.nextInt());
				break;
			case 4:System.out.println("enter employee id to apply leave");
			EmployeeDAO.LeavesApply(sc.nextInt());
			break;
			/*case 3:
				productDAO.bill();
				customerMenu();
				break;
			case 4:
				productDAO.back();
				break;*/
			default:
				System.out.println("Please select your choice range 1-4 only");

			}
		}
}
