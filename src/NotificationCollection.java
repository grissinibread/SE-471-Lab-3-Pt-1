public class NotificationCollection implements NotificationCollectionIF {

    private Notification[] notifications = new Notification[10];
    private int length = 0;

    @Override
    public NotificationIteratorIF createIterator() {
        return null; //TODO: placeholder
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

        Notification notification = new Notification();

        notification.setAttachment(new Attachment(1, str)); // TODO: this may be wrong

        this.notifications[length++] = notification;
    }

    public int getLength() {
        return this.length;
    }

    public void setAttachment(Attachment a, int index) {
        //TODO: correct this code
        if(index > length)
            throw new StackOverflowError();

        this.notifications[index].setAttachment(a); //TODO: look over
    }

    //TODO: combine getLength && isEmpty
    private boolean isEmpty() {
        return this.length == 0;
    }

    private boolean isFull() {
        return this.length == notifications.length - 1;
    }
}