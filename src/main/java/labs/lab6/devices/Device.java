package labs.lab6.devices;

import labs.lab6.Commands;

public abstract class Device {
    private Controller controller;
    private Devices name;
    private int id;

    public Device(Devices name, int id) {
        this.name = name;
        this.id = id;
    }
    Devices getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    abstract void handle(Commands command);
}
