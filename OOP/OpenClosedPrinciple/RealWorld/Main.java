package OpenClosedPrinciple.RealWorld;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.addNotification(new EmailNotification());
        service.addNotification(new SMSNotification());

        service.sendAll("Hello, World!");
        // Output:
        // Sending email: Hello, World!
        // Sending SMS: Hello, World!
    }
}
