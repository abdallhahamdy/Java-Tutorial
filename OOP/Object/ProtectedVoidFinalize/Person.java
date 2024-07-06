package Object.ProtectedVoidFinalize;

public class Person {
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
    protected void finalize() throws Throwable {
        System.out.println("Person object os being garbage collected");
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public static void main(String[] args)  {
        Person person = new Person();
        person.setFirstName("Ramesh");
        person.setLastName("Fadatare");

        person = null;

        System.gc();  // Requesting JVM to run Garbage Collector

    }
}