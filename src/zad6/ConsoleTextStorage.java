package zad6;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleTextStorage implements TextStorage{

    @Override
    public String[] read() {
        System.out.println("Enter text (separated by spaces):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.split(" ");
    }

    @Override
    public void write(String[] text) {
        System.out.println("Text: " + Arrays.toString(text));
    }
}
