package labs.lab3.notificationServices;

public class SmsNotificationService implements NotificationService {
    @Override
    public void push(String eventType, String message) {
        String text = String.format("%s event is pushed via SMS. Message: %s", eventType, message);

        System.out.println(text);
    }
}
