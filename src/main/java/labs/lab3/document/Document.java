package labs.lab3.document;

public class Document {
    private DocumentTypes type;
    private String data;

    public Document(DocumentTypes type, String data) {
        this.type = type;
        this.data = data;
    }

    public DocumentTypes getType() {
        return this.type;
    }

    public String getData() {
        return this.data;
    }
}
