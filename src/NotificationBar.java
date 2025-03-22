public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection nc) {
        this.notifications = nc;
    }

    public void printNotifications() {
        NotificationIteratorIF iterator = this.notifications.createIterator();

        while(iterator.hasNext()) {
            Notification n = iterator.next();
            System.out.println(n.getContent() + '\n');
        }
    }
}