package Deloitte.OrderDiscountStrategy;

public class NotificationSystem {
    public static void main(String[] args) {
        Notifier emailNotifier = msg -> System.out.println("Email sent: " + msg);
        Notifier smsNotifier = msg -> System.out.println("SMS sent: " + msg);

        sendNotification("Welcome to the system!", emailNotifier);
        sendNotification("Your OTP is 123456", smsNotifier);
    }

    public static void sendNotification(String msg, Notifier notifier) {
        notifier.send(msg);
    }
}