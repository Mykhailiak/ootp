package labs.lab3;

import labs.lab3.commands.Command;

import java.util.ArrayList;
import java.util.List;


public class ActionsHistory {
    private List<Command> history = new ArrayList<>();

    public void add(Command command) {
        history.add(command);
    }

    public void remove(Command command) {
        history.remove(command);
    }

    public String getHistory() {
        StringBuilder builder = new StringBuilder();

        history.forEach(command -> {
            String text = String.format("Command: %s; Document id: %s\n", command.getType(), command.getDocumentId());

            builder.append(text);
        });

        return builder.toString();
    }
}