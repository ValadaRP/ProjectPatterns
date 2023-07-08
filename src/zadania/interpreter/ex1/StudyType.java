package zadania.interpreter.ex1;

public class StudyType implements Expression {


    @Override
    public String interpret(String context) {
        return switch (context) {
            case "U" -> "Uzupelniajace";
            case "I" -> "Inzynierskie";
            case "L" -> "Licencjackie";
            default -> "Unknown Study Type";

        };

    }
}
