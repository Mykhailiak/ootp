package labs.lab3.notificationServices;

public interface NotificationService {
    void push(String eventType, String message);
}
