package Object.HashCode;

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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    public static void main(String[] args)  {
        Person person1 = new Person();
        person1.setFirstName("Ramesh");
        person1.setLastName("Fadatare");

        Person person2 = new Person();
        person2.setFirstName("Ramesh");
        person2.setLastName("Fadatare");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}