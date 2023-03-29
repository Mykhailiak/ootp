package labs.lab4.devices;

import java.util.HashMap;

public class Device {
    HashMap<String, String> parsedInfo;
    protected HashMap<String, String> getParsedInfo() {
        HashMap<String, String> info = new HashMap<>();

        info.put("id", "FW421");
        info.put("placement", "bedroom");

        return info;
    }

    protected String renderInfo(HashMap<String, String> data) {
        String id = data.get("id");
        String placement = data.get("placement");

        return String.format("Id: %s;\nPlacement: %s", id, placement);
    }

    public void getInfo() {
        HashMap<String, String> data = this.getParsedInfo();
        String info = this.renderInfo(data);

        System.out.println(info);
        System.out.println("-------------");
    }
}
