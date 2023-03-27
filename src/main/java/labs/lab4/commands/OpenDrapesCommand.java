package labs.lab4.commands;

public class OpenDrapesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Drapes have been opened");
    }

    @Override
    public void stop() {
        System.out.println("Drapes have been closed");
    }
}
