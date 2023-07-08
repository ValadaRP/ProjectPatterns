package zadania.interpreter.ex1;

public class StudyField implements Expression {


    @Override
    public String interpret(String context) {
        return switch (context) {
            case "I" -> "Informatyka";
            case "M" -> "Matematyka";
            case "P" -> "Fizyka";
            default -> "unknown field";
        };
    }
}
