package zadania.interpreter.ex1;

public class StudyForm implements Expression {


    @Override
    public String interpret(String context) {
        return switch (context) {
            case "D" -> "Daily Study";
            case "Z" -> "Weekend Study";
            default -> "Unknown Study Form";
        };
    }
}
