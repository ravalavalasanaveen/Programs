package Day3;

class Employee {
	
	private String Name; 
	private double Salary;
	
//	public String getName() {
//		return Name;
//	}
	
	public void setName(String name) {
		Name = name;
	}
//	public double getSalary() {
//		return Salary;
//	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	public void display()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Salary: "+Salary);
	}
	
}

public class EncapsulationEx {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Naveen");
		employee.setSalary(80000);
		employee.display();
		
	}

}
