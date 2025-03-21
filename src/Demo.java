public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        //TODO:  create Notifications and add them to nc
        //TODO: create attachments and link them to notifications in nc

        nb.printNotifications();
    }
}