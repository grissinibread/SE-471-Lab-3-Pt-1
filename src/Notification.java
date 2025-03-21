public class Notification {

    Attachment attachment;

    public String getContent() {
        if(this.attachment == null)
            throw new IllegalStateException();

        return attachment.toString(); // TODO: look over ( not right function )
    }

    public void setAttachment(Attachment a) {
        this.attachment = a;
    }
}