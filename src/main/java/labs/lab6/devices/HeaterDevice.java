package labs.lab6.devices;

import labs.lab6.Commands;

public class HeaterDevice extends Device {
    private boolean active;

    public HeaterDevice(int id) {
        super(Devices.HEATER, id);
    }

    @Override
    void handle(Commands command) {
        this.active = command == Commands.TURN_IN;
        String message = String.format("Heater-%s is %s", this.getId(), this.active ? "active" : "inactive");

        System.out.println(message);
    }
}
