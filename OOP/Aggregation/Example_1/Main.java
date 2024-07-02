package Aggregation.Example_1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 101);
        Employee employee2 = new Employee("Jane Smith", 102);

        Department department = new Department("IT Department");
        department.addEmployee(employee1);
        department.addEmployee(employee2);

        System.out.println("Department: " + department.getName());
        department.showEmployees();
    }
}
