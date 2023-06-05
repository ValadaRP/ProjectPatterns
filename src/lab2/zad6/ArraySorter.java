package lab2.zad6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter implements Sorter{
    private String[] texts;

    @Override
    public void sortuj() {
        if (texts.length == 0) {
            System.out.println("Brak danych do posortowania.");
        } else {
            Arrays.sort(texts);
            System.out.println("Posortowany tekst z tablicy args: " + Arrays.toString(texts));
        }
    }

    public ArraySorter() {
        texts = Client.getTexts();
    }
}
