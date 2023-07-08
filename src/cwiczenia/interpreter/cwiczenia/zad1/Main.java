package cwiczenia.interpreter.cwiczenia.zad1;

public class Main {
    public static void main(String[] args) {
        String expression = "1 U I D IPO";
        Evaluator evaluator = new Evaluator(expression);
        String result = evaluator.interpret();
        System.out.println(result);
    }
}
