package zadania.iterator.exercises.ex2;

public class ConcreteCollection implements Collection {
    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }
}
