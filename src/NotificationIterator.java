public class NotificationIterator implements NotificationIteratorIF{

    private final Notification[] notifications;
    private int index = 0;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return this.notifications.length > this.index;
    }

    @Override
    public Notification next() {
        return this.notifications[this.index++];
    }
}