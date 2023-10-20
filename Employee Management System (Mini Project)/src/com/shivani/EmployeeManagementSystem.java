package com.shivani;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeManagementSystem 
{
    public static void main(String[] args) 
    {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        
        EmployeeManager manager1 = new EmployeeManager();
        manager1.login();

        while (true) 
        {
        	System.out.println();
        	System.out.println("=================================********  Employee Management System Menu  ********=================================");
           // System.out.println("**********      ********** ");
            System.out.println();
            System.out.println(" 1. Add Employee");
            System.out.println(" 2. Display Employees");
            System.out.println(" 3. Update Employee");
            System.out.println(" 4. Delete Employee");
            System.out.println(" 5. Exit");
            System.out.println();
            System.out.println("=================================***************************************************=================================");
            System.out.print(" Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) 
            {
                case 1:
                    System.out.print(" Enter employee First Name: ");
                    String fname = scanner.nextLine();
                    
                    System.out.print(" Enter employee Last  Name: ");
                    String lname = scanner.nextLine();
                    
                    System.out.print(" Enter employee Age: ");
                    int age = scanner.nextInt();
                    
                    System.out.print(" Enter employee MobileNo: ");
                    String mobile = scanner.next();
                    
                    System.out.print(" Enter employee Salary: ");
                    double salary = scanner.nextDouble();
                    
                    System.out.print(" Enter employee Designation: ");
                    String designation = scanner.next();
                    
                    manager.createEmployee(fname,lname,age, mobile,salary,designation);
                    break;
                    
                case 2:
                    manager.displayEmployees();
                    break;
                    
                case 3:
                    System.out.print("Enter employee ID:");
                    int id = scanner.nextInt();
                    
                    System.out.print("Enter new MobileNo:");
                    String newMobile = scanner.next();
                    
                    System.out.print("Enter new Salary:");
                    double newSalary = scanner.nextDouble();
                    
                    System.out.print("Enter new Disgnation:");
                    String newDisgnation = scanner.next();
                    
                    
                    manager.updateEmployee(id,newMobile,newSalary,newDisgnation);
                    break;
                    
                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;
              
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
