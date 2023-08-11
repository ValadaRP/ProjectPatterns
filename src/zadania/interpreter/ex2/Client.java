package zadania.interpreter.ex2;

public class Client {
    public static void main(String[] args) {
        String hexNumber = "8AE";
        Interpreter interpreter = new Interpreter();
        System.out.println("Interpretacja: "+interpreter.interpret(hexNumber));
        System.out.println("Interpretacja: "+interpreter.interpret("4D2"));


    }
}
