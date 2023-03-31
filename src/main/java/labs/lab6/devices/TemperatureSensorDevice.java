package labs.lab6.devices;

import labs.lab6.Commands;

public class TemperatureSensorDevice extends Device {
    public TemperatureSensorDevice(int id) {
        super(Devices.TEMPERATURE_SENSOR, id);
    }

    public void setTemperature(int value) {
        this.getController().onTemperatureChange(value);
    }

    @Override
    void handle(Commands command) {

    }
}
