public class Demo {
    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);

        for(int i = 1; i <= 10; i++) {
            nc.addItem("Notification " + i);
        }

        MediaAttachment media = new MediaAttachment(0, "Photo", 50);
        FileAttachment file = new FileAttachment(1, "Document", 5);

        for(int i = 0; i < 10; i++) {
            if(i > 5) {
                nc.setAttachment(file, i);
            }
            else {
                nc.setAttachment(media, i);
            }
        }

        nb.printNotifications();
    }
}