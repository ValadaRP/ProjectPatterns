package zad6;

import java.util.Arrays;

public class TextSorter {
    private TextStorage storage;

    public TextSorter(TextStorage storage) {
        this.storage = storage;
    }

    public void sort() {
        String[] text = storage.read();
        Arrays.sort(text);
        storage.write(text);
    }
}
