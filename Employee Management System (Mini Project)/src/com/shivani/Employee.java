package com.shivani;

class Employee 
{
     int id;
     String fname;
     String lname;
     int age;
     String mobile;
     double salary;
     String designation;
     
    

	
    public Employee(int id, String fname,String lname,int age, String mobile,double salary,String designation ) 
    {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.mobile = mobile;
        this.salary = salary;
        this.designation  = designation;
    }
    //getter

    public int getId() {
        return id;
    }

    public String getFName() {
        return fname;
    }
    
    public String getLName() {
        return lname;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getMobile() {
        return mobile;
    }

    public double getSalary() {
        return salary;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    //Setter
    

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    

    @Override
    public String toString() 
    {
    	//System.out.println("ID "+"          "+"Name"+"          "+"Salary");
    	
       return  id +"      "+fname+"             "+lname+"          "+age+"          "+mobile+"             "+salary+"               "+designation;
		
    }

	
}