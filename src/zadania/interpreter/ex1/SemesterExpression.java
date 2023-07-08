package zadania.interpreter.ex1;

public class SemesterExpression implements Expression {
    @Override
    public String interpret(String context) {
        return context+" semestr";
    }
}
