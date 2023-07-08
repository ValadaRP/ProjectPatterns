package cwiczenia.interpreter.cwiczenia.zad1;

public class Semester implements Expression{
    private String value;
    public Semester(String value) {
        this.value = value;
    }
    @Override
    public String interpret() {
        return value + "- semestr studiów";
    }
}
