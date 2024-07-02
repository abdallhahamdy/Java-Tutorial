package Association.Example_3;

public class Employee {
    private String name;

    private Department department; // Bidirectional association

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
