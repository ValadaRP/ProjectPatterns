package lab2.zad6;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleSorter implements Sorter{
    private String[] texts;

    @Override
    public void sortuj() {
        if (texts.length == 0) {
            System.out.println("Brak danych do posortowania.");
        } else {
            Arrays.sort(texts);
            System.out.println("Posortowany tekst z konsoli: " + Arrays.toString(texts));
        }
    }

    public ConsoleSorter() {
        texts = Client.getTexts();
    }
}
