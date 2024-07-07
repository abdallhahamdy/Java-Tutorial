package SingleResponsibiltyPrinciple.Example_1_SRP;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");

        UserRepository userRepository = new UserRepository();
        userRepository.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "Welcome to our platform!");
    }
}
