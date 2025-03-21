public class Attachment {
    private int uniqueID;
    private String author;

    public Attachment(int ID, String a) {
        this.uniqueID = ID;
        this.author = a;
    }

    public void preview() {
        System.out.println("Unique ID: " + this.uniqueID);
        System.out.println("Author: " + this.author);
    }
}