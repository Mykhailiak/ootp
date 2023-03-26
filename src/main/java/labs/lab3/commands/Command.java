package labs.lab3.commands;

public class Command {
    private CommandTypes type;
    private int documentId;

    public Command(CommandTypes type, int documentId) {
        this.type = type;
        this.documentId = documentId;
    }

    public CommandTypes getType() {
        return type;
    }

    public int getDocumentId() {
        return documentId;
    }
}
