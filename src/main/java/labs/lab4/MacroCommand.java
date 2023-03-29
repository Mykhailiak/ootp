package labs.lab4;

import labs.lab4.commands.Command;

import java.util.ArrayList;

public class MacroCommand {
    private ArrayList<Command> commands;

    public MacroCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public void perform() {
        this.commands.forEach(command -> command.execute());
    }

    public void cancel() {
        this.commands.forEach(command -> command.execute());
    }
}
