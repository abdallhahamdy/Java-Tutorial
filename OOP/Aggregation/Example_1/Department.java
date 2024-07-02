package Aggregation.Example_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name ) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName());
        }
    }

    public String getName() {
        return name;
    }
}
