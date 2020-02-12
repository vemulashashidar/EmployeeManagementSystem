package com.ems.main;

import java.util.Scanner;

import com.ems.menu.EmployeeDetails;
//import com.pms.menu.ProductDetails;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("|  EMPLOYEE MANAGEMENT SYSTEM |");
			System.out.println("-------------------------------");
			System.out.println("|  1. ADMIN                   |");
			System.out.println("|  2. EMPLOYEE                |");
			System.out.println("|  3. EIXT                    |");
			System.out.println("-------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				EmployeeDetails.adminMenu();
				break;
			case 2:
				EmployeeDetails.EmployeeMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select choice range 1-3 only");
			}
	}

	}}
