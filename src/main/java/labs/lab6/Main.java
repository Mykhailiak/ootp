package labs.lab6;

import labs.lab6.devices.Controller;
import labs.lab6.devices.HeaterDevice;
import labs.lab6.devices.TemperatureSensorDevice;
import labs.lab6.expressions.ConstExpression;
import labs.lab6.expressions.SumExpression;

public class Main {
    public static void setupDevices() {
        Controller controller = new Controller(1);
        HeaterDevice heaterDeviceA = new HeaterDevice(2);
        HeaterDevice heaterDeviceB = new HeaterDevice(3);
        TemperatureSensorDevice temperatureSensorDevice = new TemperatureSensorDevice(4);

        controller.registerDevice(heaterDeviceA);
        controller.registerDevice(heaterDeviceB);
        controller.registerDevice(temperatureSensorDevice);

        temperatureSensorDevice.setTemperature(32);
        temperatureSensorDevice.setTemperature(12);
    }

    public static void main(String[] args) throws Exception {
        setupDevices();
        Context context = new Context();
        ConstExpression aExpression = new ConstExpression("WEIGHT", 5);
        ConstExpression bExpression = new ConstExpression("HEIGHT", 10);
        SumExpression sumExpression = new SumExpression(aExpression, bExpression);

        context.setConst(aExpression);
        context.setConst(bExpression);

        Integer sum = sumExpression.interpret(context);

        System.out.println(String.format("Sum of a and b = %s", sum));
    }
}
