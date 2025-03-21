public class NotificationCollection implements NotificationCollectionIF {

    private Notification[] notifications = new Notification[10];
    private int length = 0;

    //TODO: this function ( look over it )
    @Override
    public NotificationIteratorIF createIterator() {
        return new NotificationIterator(this.notifications);
    }

    public Notification getItem(int index) {
        if(isEmpty() || index > this.length)
            throw new IllegalStateException();

        return this.notifications[index];
    }

    //TODO: this function
    public void addItem(String str) {
        if(isFull())
            throw new StackOverflowError();
        else if(isEmpty())
            notifications[length++] = new Notification(str);

        // something must be done here
    }

    public int getLength() {
        return this.length;
    }

    public void setAttachment(Attachment a, int index) {
        if(index > length || isEmpty())
            throw new IndexOutOfBoundsException();

        this.notifications[index].setAttachment(a);
    }

    private boolean isEmpty() {
        return this.length == 0;
    }

    private boolean isFull() {
        return this.length == notifications.length - 1;
    }
}