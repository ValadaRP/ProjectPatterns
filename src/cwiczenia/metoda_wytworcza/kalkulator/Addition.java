package cwiczenia.metoda_wytworcza.kalkulator;

public class Addition implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a+b;
    }
}
