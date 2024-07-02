package Cohesion.Example_1;

public class EmployeeService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to: " + email + ", Message: " + message);
    }
}
