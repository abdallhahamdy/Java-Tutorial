package this_Keyword;

public class UserWithThisKeyword {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public UserWithThisKeyword(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", firstName=" + firstName +", lastName=" + lastName +", age=" + age +"]";
    }

    public static void main(String[] args) {
        UserWithThisKeyword user = new UserWithThisKeyword(1, "Ramesh", "Fadatare", 28);
        System.out.println(user.toString());
    }
}
