package labs.lab3.eventManager;

import labs.lab3.notificationServices.NotificationService;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<NotificationService>> listeners = new HashMap<>();

    public void subscribe(String event, NotificationService listener) {
        List<NotificationService> listenersByEvent = listeners.get(event);

        if (listenersByEvent == null) {
            listeners.put(event, new ArrayList<>());
        }

        listeners.get(event).add(listener);
    }

    public void unsubscribe(String eventType, NotificationService listener) {
        List<NotificationService> listenersByEvent = listeners.get(eventType);

        listenersByEvent.remove(listener);
    }

    public void notify(String eventType, String message) {
        List<NotificationService> listenersByEvent = listeners.get(eventType);
        for (NotificationService listener : listenersByEvent) {
            listener.push(eventType, message);
        }
    }
}
