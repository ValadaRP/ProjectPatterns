package lab2.zad6;

public class ConsoleTextStorage extends TextStorage{
    @Override
    public Sorter createSorter() {
        return new ConsoleSorter();
    }
}
