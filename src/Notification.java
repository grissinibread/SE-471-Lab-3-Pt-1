public class Notification {

    public String content;
    private Attachment attachment;

    public Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setAttachment(Attachment a) {
        this.attachment = a;
    }
}