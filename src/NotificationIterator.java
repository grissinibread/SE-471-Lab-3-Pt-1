public class NotificationIterator implements NotificationIteratorIF{

    private int counter = 0;

    Notification[] notifications;

    public NotificationIterator(Notification[] notifications) {
        this.notifications = notifications;
    }

    @Override
    public boolean hasNext() {
        return false; //TODO: placeholder
    }

    //TODO: this function
    @Override
    public Notification next() {
        return null;
    }
}