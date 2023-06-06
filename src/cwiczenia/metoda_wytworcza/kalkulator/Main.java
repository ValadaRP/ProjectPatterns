package cwiczenia.metoda_wytworcza.kalkulator;

import cwiczenia.metoda_wytworcza.kalkulator.products.Operation;

public class Main {
    public static void main(String[] args){
        Calcualtor calcualtor = new Calcualtor();
        Operation addition = OperationFactory.createOperation("+");
        calcualtor.setOperation(addition);
        double result = calcualtor.calculate(2,4);
        System.out.println(result);
    }
}
