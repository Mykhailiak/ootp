package labs.lab4.devices;

import java.util.HashMap;

public class Cooler extends Device {
    @Override
    protected HashMap<String, String> getParsedInfo() {
        HashMap<String, String> info = new HashMap<>();

        info.put("id", "cooler_FA420");
        info.put("placement", "cooler_bedroom");

        return info;
    }
}
