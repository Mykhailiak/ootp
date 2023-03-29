package labs.lab4;

import labs.lab4.commands.Command;
import labs.lab4.commands.OpenDrapesCommand;
import labs.lab4.commands.OpenWindowsCommand;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OpenDrapesCommand openDrapesCommand = new OpenDrapesCommand();
        OpenWindowsCommand openWindowsCommand = new OpenWindowsCommand();
        ArrayList<Command> commandsList = new ArrayList<>();

        commandsList.add(openDrapesCommand);
        commandsList.add(openWindowsCommand);

        MacroCommand commandsGroup = new MacroCommand(commandsList);

        commandsGroup.perform();
        System.out.println("A few moments later...");
        commandsGroup.cancel();
    }
}
