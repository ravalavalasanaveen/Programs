package Day3;



abstract class Employee1 {
	String name; 
	int empId;
	
	public Employee1(String name, int empId) {
		this.name=name;
		this.empId=empId;
	}
	
	abstract double calculateSalary();
	
	public void display()
	{
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+ name);
	}
}

class FullTimeEmployee extends Employee1{
	double monthlySalary; 
	
	public FullTimeEmployee(String name, int empId, double monthlySalary) {
		
		// super is used to call the constructor of the parent class 
		
		super(name, empId); // call the Employee class constructor and initialize name and empID
		this.monthlySalary=monthlySalary;
		
	}
	
	@Override 
	
	// overriding the abstract method in the parent class 
	double calculateSalary()
	{
		return monthlySalary;
	}
}

class PartTimeEmployee extends Employee1{
	
	int hoursWorked; 
	double ratePerHour; 
	
	public PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
		super(name, empId); 
		this.hoursWorked=hoursWorked;
		this.ratePerHour=ratePerHour;
		
	}
	
	@Override 
	
	double calculateSalary()
	{
		return hoursWorked*ratePerHour;
	}
}

public class PayrollSystem {

	public static void main(String[] args) {
		
	Employee1 e1 = new FullTimeEmployee("Navi", 10028, 90000);
	Employee1 e2 = new PartTimeEmployee("Ram", 10255, 80, 300);
	
	e1.display();
	
	System.out.println("Salary: "+ e1.calculateSalary());
	System.out.println("----------------------------------");
	
	e2.display();
	
	System.out.println("Salary: "+ e2.calculateSalary());
		

	}

}
