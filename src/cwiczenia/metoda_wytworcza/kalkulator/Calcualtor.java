package cwiczenia.metoda_wytworcza.kalkulator;

public class Calcualtor {
    private Operation operation;
    public void setOperation(Operation operation){
        this.operation = operation;
    }

    public double calculate(double a, double b){
        if (operation != null) {
            return operation.calculate(a, b);
        } else {
            throw new IllegalStateException("Nieustawiona operacja!");
        }
    }
}
