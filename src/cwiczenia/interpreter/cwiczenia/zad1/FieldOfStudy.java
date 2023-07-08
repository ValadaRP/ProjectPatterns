package cwiczenia.interpreter.cwiczenia.zad1;

public class FieldOfStudy implements Expression{
    private String value;
    public FieldOfStudy(String value) {
        this.value = value;
    }
    @Override
    public String interpret() {
        String interpretation;
        if (value.equals("I")) {
            interpretation = "I - informatyka";
        } else {
            interpretation = "inny kierunek";
        }
        return interpretation;
    }
}
