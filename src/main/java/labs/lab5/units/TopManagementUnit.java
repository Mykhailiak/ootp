package labs.lab5.units;

public class TopManagementUnit extends Unit {
    public TopManagementUnit(Unit parent) {
        super("Top Management", parent, 1);
    }

    @Override
    public void notifyManager() {
        System.out.println("Top managers have been notified");
    }
}
