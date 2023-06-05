package lab2.zad6;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
    private static String[] texts;

    public static void main(String[] args) {
        texts = getTexts(args);

        // Wybór sposobu zapisu tekstu
        TextStorage textStorage = getTextStorage(args);

        // Tworzenie obiektu Sorter z użyciem Factory Method
        Sorter sorter = textStorage.createSorter();

        // Wywołanie sortowania
        sorter.sortuj();
    }

    private static String[] getTexts(String[] args) {
        if (args.length > 0) {
            // Jeśli przekazano argumenty, zwróć je jako tablicę łańcuchową
            return Arrays.copyOfRange(args, 0, args.length);
        } else {
            // W przeciwnym razie pobierz teksty z konsoli
            Scanner scanner = new Scanner(System.in);
            System.out.print("Wprowadź teksty oddzielone spacją: ");
            String input = scanner.nextLine();
            return input.split(" ");
        }
    }

    private static TextStorage getTextStorage(String[] args) {
        if (args.length > 0 ) {
            return new ArrayTextStorage();
        } else {
            return new ConsoleTextStorage();
        }
    }

    public static String[] getTexts() {
        return texts;
    }
}
