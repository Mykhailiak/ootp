package labs.lab6;

public class SumExpression extends Expression {
    private ConstExpression a;
    private ConstExpression b;

    public SumExpression(ConstExpression a, ConstExpression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer interpret(Context context) throws Exception {
        System.out.println(this.a);
        return this.a.interpret(context) + this.b.interpret(context);
    }
}
