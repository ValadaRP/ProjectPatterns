package zadania.interpreter.ex2;

public class HexExpression implements Expression{
    @Override
    public int interpret(String context) {
        return Integer.parseInt(context,16);
    }
}
