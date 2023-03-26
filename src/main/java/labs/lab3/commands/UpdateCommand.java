package labs.lab3.commands;

public class UpdateCommand extends Command {
    public UpdateCommand(int documentId) {
        super(CommandTypes.UPDATE, documentId);
    }
}
