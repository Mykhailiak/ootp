package labs.lab5.units;

import java.time.ZonedDateTime;

public class RegionUnit extends Unit {
    public RegionUnit(Unit parent) {
        super("Region Management", parent, 2);
    }

    @Override
    public void notifyManager() {
        if (ZonedDateTime.now().getHour() >= 20) {
            this.getParent().notifyManager();
        } else {
            System.out.println("Region managers have been notified");
        }
    }
}
