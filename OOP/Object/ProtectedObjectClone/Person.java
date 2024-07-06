package Object.ProtectedObjectClone;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setFirstName("Ramesh");
        person1.setLastName("Fadatare");

        Person person2 = (Person) person1.clone();

        System.out.println(person1);
        System.out.println(person2);
    }
}
