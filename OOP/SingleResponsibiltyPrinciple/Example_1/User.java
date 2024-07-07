package SingleResponsibiltyPrinciple.Example_1;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveUser() {
        // Code to save user to database
        System.out.println("User saved to database.");
    }

    public void sendEmail(String message) {
        // Code to send email
        System.out.println("Email sent to " + email + " with message: " + message);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        user.saveUser();
        user.sendEmail("Welcome to our platform!");
    }
}