package cwiczenia.metoda_wytworcza.kalkulator;

import cwiczenia.metoda_wytworcza.kalkulator.products.Addition;
import cwiczenia.metoda_wytworcza.kalkulator.products.Operation;
import cwiczenia.metoda_wytworcza.kalkulator.products.Substraction;

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
