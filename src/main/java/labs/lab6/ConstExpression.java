package labs.lab6;

public class ConstExpression extends Expression {
    private int value;
    private String name;

    public ConstExpression(String name, int value) {
        this.value = value;
        this.name = name;
    }

    @Override
    public Integer interpret(Context context) throws Exception {
        return context.lookUp(name);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
