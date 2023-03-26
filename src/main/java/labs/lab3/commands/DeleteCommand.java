package labs.lab3.commands;

public class DeleteCommand extends Command {
    public DeleteCommand(int documentId) {
        super(CommandTypes.DELETE, documentId);
    }
}
