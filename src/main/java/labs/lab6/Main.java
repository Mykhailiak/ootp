package labs.lab6;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
        ConstExpression aExpression = new ConstExpression("WEIGHT", 5);
        ConstExpression bExpression = new ConstExpression("HEIGHT", 10);
        SumExpression sumExpression = new SumExpression(aExpression, bExpression);

        context.setConst(aExpression);
        context.setConst(bExpression);

        Integer sum = sumExpression.interpret(context);

        System.out.println(String.format("Sum of a and b = %s", sum));
    }
}
