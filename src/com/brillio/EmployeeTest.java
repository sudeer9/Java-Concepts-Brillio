package com.brillio;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.companyName="Brillio";
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSal=5000;
		
		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSal=6000;
		
		emp3.empId=103;
		emp3.empName="Jason";
		emp3.empSal=7000;
		
		/*System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		Employee.displayEmployeeDetails(emp1);
		Employee.displayEmployeeDetails(emp2);
		Employee.displayEmployeeDetails(emp3);*/
		
		emp1.printEmployeeDetails();
		System.out.println("================================");
		emp2.printEmployeeDetails();
		System.out.println("================================");
		emp3.printEmployeeDetails();
		
		
		
		

	}

}
