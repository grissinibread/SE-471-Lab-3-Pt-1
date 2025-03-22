public class MediaAttachment extends Attachment{

    private int length_Second;

    public MediaAttachment(int ID, String a, int length) {
        super(ID, a);
        this.length_Second = length;
    }

    @Override
    public String toString() {
        return super.toString() + "Length: " + length_Second + " seconds";
    }
}