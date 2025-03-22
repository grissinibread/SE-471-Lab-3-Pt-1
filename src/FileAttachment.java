public class FileAttachment extends Attachment {

    private int size_Byte;

    public FileAttachment(int ID, String a, int size) {
        super(ID, a);
        this.size_Byte = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Size: " + size_Byte + " bytes";
    }
}