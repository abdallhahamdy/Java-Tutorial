import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Customer {
    private long id;
    private String name;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Example_7 {
    public static void main(String[] args) {
        Set<Customer> customers = new HashSet<>();
        customers.add(new Customer(1, "Ramesh"));
        customers.add(new Customer(2, "Pramod"));
        customers.add(new Customer(3, "Sanjay"));

        System.out.println(customers);
    }
}
