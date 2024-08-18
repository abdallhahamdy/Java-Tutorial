import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    private String id;
    private String name;

    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Employee, String> employeeMap = new HashMap<>();

        Employee e1 = new Employee("1", "John");
        Employee e2 = new Employee("2", "Tom");

        employeeMap.put(e1, e1.getName());
        employeeMap.put(e2, e2.getName());

        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
