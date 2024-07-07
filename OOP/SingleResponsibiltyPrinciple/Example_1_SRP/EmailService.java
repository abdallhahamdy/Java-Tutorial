package SingleResponsibiltyPrinciple.Example_1_SRP;

public class EmailService {
    public void sendEmail(User user, String message) {
        // Code to send email
        System.out.println("Email sent to " + user.getEmail() + " with message: " + message);
    }
}
