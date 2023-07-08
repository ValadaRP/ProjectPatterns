package cwiczenia.interpreter.cwiczenia.zad1;

public class StudyMode implements Expression{
    private String value;
    public StudyMode(String value) {
        this.value = value;
    }
    @Override
    public String interpret() {
        String interpretation;
        if (value.equals("D")) {
            interpretation = "D- stacjonarne";
        } else {
            interpretation = "niestacjonarne";
        }
        return interpretation;
    }
}
