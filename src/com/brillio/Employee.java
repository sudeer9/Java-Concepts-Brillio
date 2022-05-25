package com.brillio;

//pass by reference concept
//this class is referred as template class
public class Employee {
	
	public int empId;
	public String empName;
	public double empSal;
	public static String companyName;//this will be common for
	//all employees in a company so its static
	
	/*public static void displayEmployeeDetails(Employee e)
	{
		System.out.println(e);
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSal);
		System.out.println(Employee.companyName);
		System.out.println("------------------");
	}*/

	public void printEmployeeDetails()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(Employee.companyName);
	}
}

