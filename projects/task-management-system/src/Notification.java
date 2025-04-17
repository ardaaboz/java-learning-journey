import java.time.LocalDateTime;

public class Notification {
    // Encapsulated field
    private String notificationMessage;
    // Declaring time here, I want it to be set as soon as it get's created
    private LocalDateTime notificationTime = LocalDateTime.now();

    // Constructor
    Notification(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    // Getters and setters
    public String getNotificationMessage() {
        return notificationMessage;
    }
    public LocalDateTime getNotificationTime() {
        return notificationTime;
    }
    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
