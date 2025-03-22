public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        //TODO:  create Notifications and add them to nc
        for(int i = 1; i <= 10; i++) {
            nc.addItem("Notification " + i);
        }

        nb.printNotifications();

        //TODO: create attachments and link them to notifications in nc
    }
}