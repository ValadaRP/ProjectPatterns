package zad6;
import java.util.Arrays;
public class CommandLineStorage implements TextStorage{
    private String[] arguments;

    public CommandLineStorage(String[] arguments) {
        this.arguments = arguments;
    }
    @Override
    public String[] read() {
        return Arrays.copyOfRange(arguments, 1, arguments.length);
    }

    @Override
    public void write(String[] text) {
        System.out.println("Text: " + Arrays.toString(text));
    }
}
