package labs.lab6.expressions;

import labs.lab6.Context;

public class SumExpression extends Expression {
    private ConstExpression a;
    private ConstExpression b;

    public SumExpression(ConstExpression a, ConstExpression b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer interpret(Context context) throws Exception {
        return this.a.interpret(context) + this.b.interpret(context);
    }
}
