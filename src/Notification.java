public class Notification {

    public String content;
    private Attachment attachment;

    public Notification(String content) {
        this.content = content;
    }

    public String getContent() {
        System.out.println(content + '\n');
        return this.attachment.toString();
    }

    public void setAttachment(Attachment a) {
        this.attachment = a;
    }
}