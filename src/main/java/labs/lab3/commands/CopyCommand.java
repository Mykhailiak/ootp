package labs.lab3.commands;

public class CopyCommand extends Command {
    public CopyCommand(int documentId) {
        super(CommandTypes.COPY, documentId);
    }
}
