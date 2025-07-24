package Day5;

import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class SortEmployeeByName {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rajesh", 1));
        employeeList.add(new Employee("Neha", 2));
        employeeList.add(new Employee("Tanu", 3));
        employeeList.add(new Employee("Gopal", 4));
        employeeList.add(new Employee("Esha", 5));

        System.out.println("Before Sorting:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        employeeList.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

        System.out.println("\nAfter Sorting by Name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
