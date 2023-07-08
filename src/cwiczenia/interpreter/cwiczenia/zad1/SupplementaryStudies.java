package cwiczenia.interpreter.cwiczenia.zad1;

public class SupplementaryStudies implements Expression{
    private String value;
    public SupplementaryStudies(String value) {
        this.value = value;
    }
    @Override
    public String interpret() {
        return "U-studia uzupełniające";
    }
}
