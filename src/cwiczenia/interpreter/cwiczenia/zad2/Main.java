package cwiczenia.interpreter.cwiczenia.zad2;

public class Main {
    public static void main(String[] args) {
        String hexadecimalNumber = "FFFF";

        Evaluator evaluator = new Evaluator();
        evaluator.setVariable("hex", new HexadecimalNumber(hexadecimalNumber));

        Expression expression = evaluator.getVariable("hex");
        int result = expression.interpret();

        System.out.println("Hexadecimal: " + hexadecimalNumber);
        System.out.println("Decimal: " + result);
    }
}
