package labs.lab4.commands;

public class OpenWindowsCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Windows have been opened");
    }

    @Override
    public void undo() {
        System.out.println("Windows have been closed");
    }
}
