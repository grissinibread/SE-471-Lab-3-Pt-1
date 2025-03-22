public class NotificationCollection implements NotificationCollectionIF {

    private final Notification[] notifications = new Notification[10];
    private int length = -1;

    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(this.notifications);
    }

    public Notification getItem(int index) {
        if(isEmpty() || index > getLength())
            throw new IllegalStateException();

        return this.notifications[index];
    }

    public void addItem(String str) {
        if(isFull())
            throw new StackOverflowError();

        this.notifications[++this.length] = new Notification(str);
    }

    public int getLength() {
        return this.length;
    }

    public void setAttachment(Attachment a, int index) {
        if(index > getLength() || isEmpty())
            throw new IndexOutOfBoundsException();

        this.notifications[index].setAttachment(a);
    }

    private boolean isEmpty() {
        return this.length == 0;
    }

    private boolean isFull() {
        return this.length == this.notifications.length;
    }
}