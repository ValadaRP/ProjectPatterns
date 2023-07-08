package cwiczenia.interpreter.cwiczenia.zad1;

public class Specialization implements Expression{
    private String value;
    public Specialization(String value) {
        this.value = value;
    }
    @Override
    public String interpret() {
        return value + " – inżynieria produkcji oprogramowania";
    }
}
