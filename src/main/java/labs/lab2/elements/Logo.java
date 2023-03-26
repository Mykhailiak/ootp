package labs.lab2.elements;

public class Logo {
    private Position position;
    private String type = "standard";

    public Logo(Position position, String type) {
        this.position = position;
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Position getPosition() {
        return this.position;
    }
}
