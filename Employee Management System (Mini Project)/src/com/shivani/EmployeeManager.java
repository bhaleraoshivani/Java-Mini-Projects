package com.shivani;


import java.util.ArrayList;
import java.util.Scanner;

class EmployeeManager 
{
	
   Scanner sc = new Scanner (System.in);
	
	String uname;
	String upass;

	
	
	void login()
	{
		System.out.println("****************************************************     Welcome     ***************************************************");
		System.out.println();
		
		System.out.println("=============================================********    Login    ********=============================================");
		System.out.println(" Enter Username : ");
		uname = sc.next();
		System.out.println(" Enter Password : ");
		upass = sc.next();
		
		if(uname.equals("Shivani")&& upass.equals("1234")) 
		{
			System.out.println("Login Succesfully");
			System.out.println("=========================================================================================================================");
		}
		else
		{
			System.out.println(" Wrong Username & pasword !!!!!!");
			System.out.println(" Please Try Agin");
			
			login();
		}
		
		
	}//login method end	

	
    public ArrayList<Employee> employees;
    public  int nextId = 1;

    public EmployeeManager()
    {
        employees = new ArrayList<>();
    }

    public void createEmployee(String fname,String lname,int age, String mobile,double salary,String designation) 
    {
        Employee employee = new Employee(nextId, fname,lname,age,mobile, salary,designation);
        employees.add(employee);
        nextId++;
        System.out.println("************* Employee added successfully.*************");
        System.out.println("======================================================================================================================================");
    }
    

    public void displayEmployees() 
    {
    	System.out.println();
        System.out.println("                                   ******************   Employee List:   ******************                                          ");
    	System.out.println();
    	System.out.println("======================================================================================================================================");
        System.out.println("ID"+"     "+"FirstName"+"           "+"LastName"+"          "+"Age"+"          "+"mobile"+"                "+"Salary"+"               "+"Disgnation");
     
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
        System.out.println("======================================================================================================================================");
    }
    

    public void updateEmployee(int id, String newMobile, double newSalary,String newDisgnation) 
    {
        for (Employee employee : employees) 
        {
            if (employee.getId() == id)
            {
            	employee.setMobile(newMobile);
            	employee.setSalary(newSalary);
            	employee.setDesignation(newDisgnation);
                System.out.println("************* Record updated successfully.*************");
                System.out.println("======================================================================================================================================");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    
    
    public void deleteEmployee(int id) 
    {
        for (Employee employee : employees) 
        {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("************* Employee deleted successfully.*************");
                System.out.println("======================================================================================================================================");
                return;
            }
        }
        System.out.println("Employee not found !!!!!!!!!!!.");
    }

	
}

