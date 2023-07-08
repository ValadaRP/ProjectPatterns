package zadania.interpreter.ex1;

public class Client {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator("1UID-IPO");
        System.out.println(evaluator.interpret());
        Evaluator evaluator2 = new Evaluator("4IMZ-MAT");
        System.out.println(evaluator2.interpret());
    }
}
