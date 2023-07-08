package cwiczenia.adamg;

public abstract class Publisher {
    public abstract void add(Observer o);

    public abstract void remove(Observer o);

    public abstract void notifyObserver(Item item);
}
