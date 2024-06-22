package this_Keyword;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public User(int id, String firstName, String lastName, int age) {
        id = id;
        firstName = firstName;
        lastName = lastName;
        age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName +", lastName=" + lastName +", age=" + age +"]";
    }

    public static void main(String[] args) {
        User user = new User(1, "Ramesh", "Fadatare", 28);
        System.out.println(user.toString());
    }
}
