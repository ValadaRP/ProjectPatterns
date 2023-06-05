package lab2.zad6;

public class ArrayTextStorage extends TextStorage{
    @Override
    public Sorter createSorter() {
        return new ArraySorter();
    }
}
