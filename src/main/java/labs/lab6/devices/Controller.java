package labs.lab6.devices;

import labs.lab6.Commands;

import java.util.ArrayList;

public class Controller extends Device {
    ArrayList<Device> devices = new ArrayList();

    public Controller(int id) {
        super(Devices.CONTROLLER, id);
    }

    public void onTemperatureChange(int temperature) {
        if (temperature >= 23 || temperature <= 15) {
            Commands command = temperature >= 23 ? Commands.TURN_OF : Commands.TURN_IN;

            devices.forEach(device -> {
                if (device.getName() == Devices.HEATER) {
                    device.handle(command);
                }
            });
        }
    }

    public void registerDevice(Device device) {
        device.setController(this);
        devices.add(device);
    }

    @Override
    void handle(Commands command) {

    }
}
