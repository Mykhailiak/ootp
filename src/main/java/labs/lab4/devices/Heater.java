package labs.lab4.devices;

import java.util.HashMap;

public class Heater extends Device {
    @Override
    protected HashMap<String, String> getParsedInfo() {
        HashMap<String, String> info = new HashMap<>();

        info.put("id", "heater_FMA42");
        info.put("placement", "heater_bedroom");

        return info;
    }
}
