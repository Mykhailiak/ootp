package labs.lab6.expressions;

import labs.lab6.Context;

public abstract class Expression {
    public abstract Integer interpret(Context context) throws Exception;
}
