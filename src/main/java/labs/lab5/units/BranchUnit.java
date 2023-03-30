package labs.lab5.units;

import java.time.ZonedDateTime;

public class BranchUnit extends Unit {
    public BranchUnit(Unit parent) {
        super("Branch Management", parent, 3);
    }

    @Override
    public void notifyManager() {
        if (ZonedDateTime.now().getYear() >= 2010) {
            this.getParent().notifyManager();
        } else {
            System.out.println("Branch managers have been notified");
        }
    }
}
