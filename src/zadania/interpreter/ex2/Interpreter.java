package zadania.interpreter.ex2;

public class Interpreter {
    private Expression expression;

    public Interpreter() {
        this.expression = new HexExpression();
    }
    public int interpret(String context) {
        return expression.interpret(context);
    }
}
