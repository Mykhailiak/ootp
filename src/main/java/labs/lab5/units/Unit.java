package labs.lab5.units;

public abstract class Unit {
    private String name;
    private Unit parent;
    private int unitId;

    public Unit(String name, Unit parent, int unitId) {
        this.name = name;
        this.parent = parent;
        this.unitId = unitId;
    }

    public Unit getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    abstract public void notifyManager();
}
