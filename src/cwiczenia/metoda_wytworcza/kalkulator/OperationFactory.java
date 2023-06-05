package cwiczenia.metoda_wytworcza.kalkulator;

public class OperationFactory {
    public static Operation createOperation(String operator){
        switch (operator){
        case "+":
            return new Addition();
        case "-":
            return new Substraction();
        default:
            throw new IllegalArgumentException("Nieznany operator: " + operator);
        }
    }
}
